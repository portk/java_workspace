package stream.kepco.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import exception.kepco.com.KepcoException;

public class Server {
	private ServerSocket ss;
	private Socket innerSocket;
	
	public void serverStart() throws Exception {
		ss = new ServerSocket(23333);
		System.out.println("���� ������ �����Ǿ����ϴ�.");
		while(true) {
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			innerSocket = ss.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
			getMessage(innerSocket);
		}
	}
	
	public void getMessage(Socket innerSocket) throws Exception{
		// �ޱ�
		InputStream is=innerSocket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		// ������
//		OutputStream os = innerSocket.getOutputStream();
//		OutputStreamWriter osr = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osr);
//		bw.write("� ���̼�");
//		bw.flush();
		//flush() ���� ����ؼ� ������� ������ �� �Ⱦ���.
		
		PrintWriter pw = new PrintWriter(innerSocket.getOutputStream(),true);
		pw.write("�������");
		
		String chat = br.readLine();
		System.out.println("Ŭ���̾�Ʈ�� ���� ���ڿ� : " + chat);
		
		br.close();
		pw.close();
	}
	
	public static void main(String[] args) {
		try {
			Server sv = new Server();
			sv.serverStart();
		} catch(Exception e) {
			new KepcoException(e);
		}finally {
			System.out.println("������ ����Ǿ����ϴ�");
		}
	}

}
