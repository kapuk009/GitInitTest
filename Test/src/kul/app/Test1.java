package kul.app;

public class Test1 {
	public boolean chkText(String text) {
		//long sftime = System.currentTimeMillis();
		
		boolean chk = false;
		
		System.out.println("Mod: " +text.length() % 2);
		
		if (text.length() % 2  == 0 ) {
			text = text.toUpperCase();
			
			System.out.println("toUpperCase : " + text);
			
			int j = text.length()-1;
			
			for (int i =0;i<text.length()/2;i++) {
//				System.out.println("i: " + i);
//				System.out.println(text.charAt(i) + " : " +text.charAt(j));
				if (text.charAt(i) == text.charAt(j) ) {
					chk = true;
					j--;
				} else {
					chk = false;
					break;
				}
				
			}
		} else {
			chk = false;
		}
		
		System.out.println("That "+text+ " is " + chk);
			
		//System.out.println(System.currentTimeMillis() - sftime);
		
		return chk;
	}
	
	
	public boolean chkTextNew(String text) {
		//long sftime = System.currentTimeMillis();
		
		boolean chk = false;
		
		System.out.println("Mod: " +text.length() % 2);
		
		if (text.length() % 2  == 0 ) {
			text = text.toUpperCase();
			
			String front = text.substring(0, text.length()/2);
			String back = text.substring(text.length()/2, text.length());
			
			System.out.println("text.toUpperCase() : " + text);
			System.out.println("back : " + back);
			
			StringBuilder sb = new StringBuilder(back);
	        
	        System.out.println("Reversed string is:" + sb.reverse().toString());
			
	        if(front.equals(sb.reverse().toString())) {
	        	chk = true;
	        } else {
	        	chk = false;
	        }
	        
		} else {
			chk = false;
		}
		
		System.out.println("That "+text+ " is " + chk);
			
		//System.out.println(System.currentTimeMillis() - sftime);
		
		return chk;
	}
	
	public static void main (String[] args) {
//		String text1 = "AABBCCDDS" ;
//		String text2 = "ABCCDA";
		String text3 = "aacaacaacaacaacaaccaAcaAcaAcaAcaAcaA";
		
		Test1 test1 = new Test1();
		
//		test1.chkText(text1);
//		test1.chkText(text2);
//		test1.chkText(text3);
		
		
		long sftime = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			//test1.chkText(text3);
			test1.chkTextNew(text3);
		}
		System.out.println("end : " + (System.currentTimeMillis() - sftime));
	}
}
