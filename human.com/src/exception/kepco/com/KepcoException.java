package exception.kepco.com;

public class KepcoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6712990504916467162L;
	
	public KepcoException(Exception e) {
		System.out.println("KepcoExceoption ���� ���ܸ� ó���մϴ�. "+e.getMessage());
	}
}
