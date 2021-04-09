package assignment;

public class Stringex2 {
	String rev=" ";
	
	public String getImage(String s) {
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		System.out.println(s+  "|" +rev);
		return s;
		
		
	}

	public static void main(String[] args) {
		Stringex2 p =new Stringex2();
		p.getImage("Earth");
	}
}



