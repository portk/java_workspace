package stream.kepco.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	BufferedReader br;
	PrintWriter pw;
	Socket client;
	
	public Client() throws Exception{
		connect();
	}
	
	public void connect() throws Exception {
		System.out.println("������ ������ �õ� �մϴ�.");
		client = new Socket("10.10.21.86", 23333);
		System.out.println("���� ����!!!");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
		pw.println("ó���Դϴ� �� �𸣳� �� ���� ��Ź�帳�ϴ�");
		
		System.out.println(br.readLine());
		
		br.close();
		pw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Client();
	}
}
