package stream.kepco.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import exception.kepco.com.KepcoException;

public class StreamTest {
	int temp;

	public void test() {
		FileInputStream fi = null;
		FileOutputStream fo =null;
		try {
			fi = new FileInputStream("c:/kepco_workspace/a.txt");
			fo = new FileOutputStream("c:/kepco_workspace/b.txt");
			while((temp=fi.read()) != -1) {
				fo.write((char)temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				fo.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void test1() {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr = new FileReader("c:/kepco_workspace/a.txt");
			fw = new FileWriter("c:/kepco_workspace/c.txt");
			while((temp=fr.read()) != -1) {
				fw.write((char)temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void test2() {
		//1.8 버전까지는 아래와 같이 사용해야 함
		try(FileReader fr = new FileReader("c:/kepco_workspace/a.txt");
			FileWriter fw = new FileWriter("c:/kepco_workspace/c.txt")) {
			while((temp=fr.read()) != -1) {
				fw.write((char)temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	public void test3() throws Exception {
		//1.9 버전 이후부터는 아래와 같이 사용 가능
		FileReader fr = new FileReader("c:/kepco_workspace/a.txt");
		FileWriter fw = new FileWriter("c:/kepco_workspace/c.txt");
		try(fr;fw) {
			while((temp=fr.read()) != -1) {
				fw.write((char)temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void test4() throws Exception {
		String temp=null;
		long start=System.currentTimeMillis();
		//1.9 버전 이후부터는 아래와 같이 사용 가능
		BufferedReader br = new BufferedReader(new FileReader("c:/kepco_workspace/a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:/kepco_workspace/c.txt"));
		try(br;bw) {
			while((temp=br.readLine()) != null) {
				bw.write(temp);
				bw.write("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis() - start;
		System.out.println("메소드 실행 시간은 " + end + " 입니다");
	}
	
	
	
	
	
	public static void main(String[] args){
//		new StreamTest().test();
//		System.out.println();
//		new StreamTest().test1();
//		System.out.println();
//		new StreamTest().test2();
//		System.out.println();
//		try {
//			new StreamTest().test3();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println();
		try {
			new StreamTest().test4();
		} catch(Exception e) {
			new KepcoException(e);
		}
	}
	
}
