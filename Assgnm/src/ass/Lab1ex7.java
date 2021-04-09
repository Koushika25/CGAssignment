package ass;

public class Lab1ex7 {
	public boolean checkNumber(int number) {
		String str=Integer.toString(number);
		char[] c=str.toCharArray();
		for(int i=0;i<c.length-1;i++) {
			if(c[i]>=c[i+1]) {
				return false;
			}
		}
		return true;
			
	}
	public static void main(String[] args) {
		Lab1ex7 i =new Lab1ex7();
		System.out.println(i.checkNumber(6009));
	}


}
