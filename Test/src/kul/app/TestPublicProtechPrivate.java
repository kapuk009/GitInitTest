package kul.app;

public class TestPublicProtechPrivate {
	
	public static void main(String[] args ) {
		PinkPanther p = new PinkPanther();
		PinkPanther fwd = new PinkPanther();
		fwd.fwd = "FWD";
		fwd.fff="FFF";
		
		System.out.println("fwd.fwd: " + fwd.fwd);
		System.out.println("fwd.fff: " + fwd.fff);
		
		PinkPanther fwd2 = new PinkPanther();
		fwd2.fwd = "FWD2";
		fwd2.fff="FFF2";
		
		System.out.println("fwd2.fwd: " + fwd2.fwd);
		System.out.println("fwd2.fff: " + fwd2.fff);
		
		System.out.println("fwd.fwd: " + fwd.fwd);
		System.out.println("fwd.fff: " + fwd.fff); 
		
//		p.getC();
//		p.getFwd();
//		p.c = "sss";
//		PinkPanther.c = "KUL3";
//		System.out.println("Get: " +p.getPublic("KUL"));
		
//		System.out.println("Get2: " +PinkPanther.getPublic("KUL2"));
	}

}
