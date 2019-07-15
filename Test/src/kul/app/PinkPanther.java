package kul.app;

public class PinkPanther {
	
	String  c = "";
	public static String fwd ="";
	public String fff = "";
	
	public static String getPublic(String kul) {
		String a = kul;
		String b;
		b = "sdfg";
		PinkPanther aaa = new PinkPanther();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c:" + aaa.c);
		return a;
	}
	
	public void getC() {
		System.out.println("CC: " + c);
	}
	
	public void getFwd(){
		System.out.println("Fwd: " + fwd );
	}
	
	protected String getProtected() {
		String a = "";
		String b;
		b = "sdfg";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		return a;
	}
	
	private String getPrivate() {
		String a = "";
		String b;
		b = "sdfg";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		return a;
	}

//	public static void main(String[] args) {
//		
//		PinkPanther pinkPanther= new PinkPanther();
//		
//		pinkPanther.getPublic();
//		pinkPanther.getProtected();
//		pinkPanther.getPrivate();	
//
//	}

}
