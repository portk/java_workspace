package generic.kepco.com;

public class MethodSend {
	
	public void send() {
		MP3 mp3 = new MP3();
		MethodReceive mr = new MethodReceive();
		mr.receive(mp3);
		int result=mr.receive1();
		int result2=mr.receive2(5, 7);
		Elec elec=mr.receive3();
		elec.volumeDown();
		elec.volumeUp();
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(mp3+"send 쪽 입니다.");
		System.out.println(mp3.temp);
		
	}
	
	
	
	public static void main(String[] args) {
		MethodSend ms = new MethodSend();
		ms.send();
	}
}
