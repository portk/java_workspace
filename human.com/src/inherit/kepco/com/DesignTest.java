package inherit.kepco.com;

import javax.swing.JFrame;

//java.lang.*패키지에 있는 클래스들은 jvm이 디폴트로 로드함
//import java.lang.*;


public class DesignTest extends JFrame{
	public static void main(String[] args) {
		DesignTest dt = new DesignTest();
		dt.setBounds(300, 300, 300, 300);
		dt.setVisible(true);

	}

}
