package kul.app;

import java.util.ArrayList;

public class TestProtect extends PinkPanther{
	
	private String bb="sdsd";
	
	public void test(){
		
	}
	
	public void test(String a){
		String aa = "www";
		bb = "";
		
	}
	
	public void test(int b){
		bb = "wwwwww";
		
	}
	
	public static void main(String[] args) {
		TestProtect testProtect = new TestProtect();
		System.out.println("bb: "+testProtect.bb);
		testProtect.test("ssss");
		System.out.println("aaaa: "+testProtect.bb);
		
		testProtect = new TestProtect();
		System.out.println("bb: "+testProtect.bb);
		testProtect.test(1);
		testProtect.test(1);
		System.out.println("aaaa: "+testProtect.bb);
		System.out.println("aaaa: "+testProtect.bb);
		testProtect = null;
		testProtect = new TestProtect();
		System.out.println("testProtect: "+testProtect);
		testProtect.bb = "";
//		testProtect.test("sss");
		if (testProtect != null && testProtect.bb.equals("")) {
			int j =1;
			for(int i=1;i<=10;++i) {
				
				System.out.println(j++);
			}
		}else {
			
		}
		
		ArrayList l = new ArrayList();
		l.add(1);
		l.add("ww");
		System.out.println(l.size());
		
		ArrayList ll=null;
		System.out.println(ll.size());
		
		int k=0;
		System.out.println(k+"");
	}
}
