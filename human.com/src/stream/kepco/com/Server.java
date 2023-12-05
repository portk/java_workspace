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
		System.out.println("서버 소켓이 생성되었습니다.");
		while(true) {
			System.out.println("클라이언트의 접속을 기다립니다.");
			innerSocket = ss.accept();
			System.out.println("클라이언트가 접속 되었습니다.");
			getMessage(innerSocket);
		}
	}
	
	public void getMessage(Socket innerSocket) throws Exception{
		// 받기
		InputStream is=innerSocket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		// 보내기
//		OutputStream os = innerSocket.getOutputStream();
//		OutputStreamWriter osr = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osr);
//		bw.write("어서 오이소");
//		bw.flush();
		//flush() 까지 써야해서 길어지기 떄문에 잘 안쓴다.
		
		PrintWriter pw = new PrintWriter(innerSocket.getOutputStream(),true);
		pw.write("어서오세요");
		
		String chat = br.readLine();
		System.out.println("클라이언트가 보낸 문자열 : " + chat);
		
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
			System.out.println("서버가 종료되었습니다");
		}
	}

}
