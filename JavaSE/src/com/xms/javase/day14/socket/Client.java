package com.xms.javase.day14.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * �ͻ���
 * @author Administrator
 *
 */
public class Client {
	//�����ڿͻ��˵�socket
	private Socket socket;
	
	public Client() throws UnknownHostException, IOException{
		System.out.println("�������ӷ���������");
		/*
		 * ����socket ������󴴽��ɹ�����˵�������Ϸ�������
		 * ��Ҫ������������ip��ַ���Ͷ�ӦӦ�õĶ˿ں�
		 */
		socket =new Socket("172.41.2.152", 8080);
		System.out.println("���������ӳɹ�");
	}
	
	public void start(){
		//��Ҫ�ӿͻ��������������һ�仰
		/*
		 * ����ͨ��Socket�����ȡһ�������
		 * �����������������Ϣ
		 * getOutputStream()
		 * ����ֵΪoutPutStream���͵���
		 * 
		 * 
		 */
		
		try {
			/**
			 * ����
			 */
			//����������ص���Ӧ�߳��У������߳�
			GetMessage gm=new GetMessage();
			Thread t=new Thread(gm);
			t.start();
			
			/**
			 * ����
			 */
			//��ȡ�����--�ֽ���
			OutputStream os= socket.getOutputStream();
			//���ֽ�����װ�ɶ�Ӧ���ַ���
			OutputStreamWriter osw=new OutputStreamWriter(os,"utf-8");
			//���ַ�����װ�ɻ����ַ���
		
			
			
			while(true){
			PrintWriter pw=new PrintWriter(osw,true);
				Scanner sc=new Scanner(System.in);
				System.out.println("������һ�仰");
				String message=sc.nextLine();
				pw.println(message);
				pw.flush();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client c=new Client();
		c.start();
	}
	
	/*
	 * ������---���ڶ�ȡ�Է������˵���Ϣ����
	 * 
	 */
	class GetMessage implements Runnable{

		@Override
		public void run() {
			/**
			 * ���շ������Ļ���
			 */
			//ͨ��socket��ȡһ��������
			try {
				InputStream is = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is,"utf-8");
				BufferedReader br=new BufferedReader(isr);
				String message =null;
				while((message = br.readLine())!=null){
					System.out.println("��˵"+message);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
