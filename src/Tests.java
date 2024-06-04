import java.awt.Image;

public class Tests {

	String jautajums;
	Image jautBilde;
	String[] jautVar;
	String[] pareizAtb;
	
	public Tests(String jautajums, Image jautBilde, String[] jautVar, String[] pareizAtb) {
		this.jautajums = jautajums;
		this.jautBilde = jautBilde;
		this.jautVar = jautVar;
		this.pareizAtb = pareizAtb;
	}
	
	public String getJautajums() {
		return jautajums;
	}
	
	public Image jautBilde() {
		return jautBilde;
	}
	
	public String[] jautVar() {
		return jautVar;
	}
	
	public String[] pareizAtb() {
		return pareizAtb;
	}
}
