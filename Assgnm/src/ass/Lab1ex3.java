package ass;

public class Lab1ex3 {
	public static void main(String[] args) {
		int n=10;
		int a=1,b=1,c;
		System.out.println(+a);
		System.out.println(+b);
		for(int i=2;i<n;++i){
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+"");
		}
	}

}
