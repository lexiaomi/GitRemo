package com.xms.javase.day14.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��������
 *  Ӧ�ô��ڽ��̣�һ��Ӧ��һ���˿ں�
 * �˿ںţ�ѡ��˿ں�Ҫע�⣺0-1024��Щ�˿ں��Ѿ���ϵͳԤ����
 * �����ڱ�д�������˿�ѡ��˿ں�ʱ��Ҫ����1024�Ķ˿ں�
 * @author Administrator
 *
 */
public class Server {
	//�����ڷ������ϵ�socket
	private ServerSocket server;
	//�̳߳ض��� --����������
	private ExecutorService threadPool;
	//����һ��������---���пͻ��˵������
	private List<PrintWriter> allOut;
	
	
	/*
	 * ��ʼ��������
	 * 
	 */
	public Server() throws Throwable{
		
		System.out.println("��ʼ��������");
		//��Ҫָ���������Ķ˿ں�
		server=new ServerSocket(8080);
		//�����̶������̵߳��̳߳�
		threadPool=Executors.newFixedThreadPool(20);
		//��ʼ��������
		allOut=new LinkedList<PrintWriter>();
		
		
		System.out.println("��������ʼ���ɹ�");
		
		
	}
	
	/*
	 * ��������ʼ�ķ���
	 */
	
	public void start(){
	/*
	 * �������˵�accept()��
	 * ���ڼ���8080,�ȴ��ͻ�������
	 * ��һ���߳������ķ�����ֱ��һ���ͻ���������ɣ���÷�������һ��socket���͵Ķ���
	 * û������һֱ���ڵȴ�״̬
	 */
		try {
			while(true){
				System.out.println("�ȴ��ͻ�������");
				Socket socket = server.accept();
				//�������socket����
				ClientHandler cs=new ClientHandler(socket);
				//�����յ���socket�������������̳߳ع���
				threadPool.execute(cs);
				System.out.println("�ͻ������ӳɹ�");
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Server server=new Server();
			server.start();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * �ڲ���---������
	 * ����socket������ɶԻ�����
	 * ������ǽ��տͻ��˷�������Ϣ
	 * �п����Ƕ���ͻ��˵���Ϣ
	 * ��Ҫ���������Ҫ���߳̽��
	 *  д��---�����ࣺ����ʹ���̳߳�
	 *  
	 */
	
	class ClientHandler implements Runnable{
		
		
		//�����ǽ��յ�ǰ�Ŀͻ��˶���
		private Socket socket;
		private String name;
		
		public ClientHandler(Socket socket){
			this.socket=socket;
//			this.name=name;
			
			InetAddress inter=socket.getInetAddress();
			//��ȡ�������IP��ַ
			String ip=inter.getHostAddress();
			//��ȡ�������
			String name1=inter.getHostName();
			//��ȡ������Ķ˿ں�
			int port = socket.getPort();
			
			System.out.println("��ȡԶ�˼������ip:"+ip+"�˿�Ϊ"+port+"���������"+name1);
			System.out.println(inter);
			System.out.println(name);
			System.out.println(port);
			
		}
		@Override
		public void run() {
			
			InputStream is;
			PrintWriter pw=null;
			try {
				/*
				 * 
				 * ���ͻ��˷���������Ϣ,�ٷ��͸��ͻ���
				 * ��Ϣ����
				 */
				//�ֽ������
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os,"utf-8");
				//�����ַ�����λ�����
				 pw=new PrintWriter(osw,true);
				addOut(pw);
				/*
				 * ����Socket������Ϣ
				 * 
				 */
	
				is = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is,"utf-8");
				BufferedReader br=new BufferedReader(isr);
			
				String getmessage=null;
				while((getmessage=br.readLine())!=null){
//					System.out.println(getmessage);
//					pw.println(getmessage);
					/*
					 * ��ĳһ���ͻ��˷��͵���Ϣ��ͨ��������
					 * �����пͻ����������������Ϣ���͸����пͻ���
					 */
					sendMssage(getmessage);
				}
				br.close();
				pw.flush();
			
				//���ղŴӿͻ��˶�ȡ����Ϣд�����ͻ�����---����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				/*
				 * �������
				 * ��ĳ���ͻ������ߺ󣬶�Ӧ��out��
				 * Ӧ�ôӹ������Ƴ�
				 */
				removeOut(pw);
				//���ߣ���ǰ�����socket����Ҫ�ر�
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		/**
		 * Ϊ�˱�֤�����������ɻ����ϵ��ʹ�û����ϵ
		 * @param pw
		 */
		//����������������
		public synchronized void addOut(PrintWriter pw){
			allOut.add(pw);
		}
		
		//�ӹ�������ɾ�������
		public synchronized void removeOut(PrintWriter pw){
			allOut.remove(pw);
		}
		
		//���������е��������---�൱�ڷ�����Ϣ
		/*
		 * ����(�ͻ����ڹ�����)
		 * �����пͻ��˵��������װ��һ������
		 * Ȼ�󽫸�������Ϣͨ�������ü��ϣ���
		 * ͨ���ͻ��˵���������͸������ͻ���
		 */
		public synchronized void sendMssage(String message){
			for ( PrintWriter pw : allOut) {
				pw.println(message);
			}
			
		}
		
	}
	
	
	
	
	
	
}
