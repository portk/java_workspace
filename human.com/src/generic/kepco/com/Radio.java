package generic.kepco.com;

public class Radio implements Elec{

	@Override
	public void volumeUp() {
		System.out.println("Radio º¼·ý¾÷");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Radio º¼·ý´Ù¿î");
		
	}
	
}
