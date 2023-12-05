package generic.kepco.com;

public class TV implements Elec {

	@Override
	public void volumeUp() {
		System.out.println("TV º¼·ý¾÷");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("TV º¼·ý´Ù¿î");
		
	}

}
