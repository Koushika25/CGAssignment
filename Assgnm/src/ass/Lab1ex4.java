package ass;

public class Lab1ex4 {
	public int primeNum(int n) {
		int count=0;
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");     
		}
		return 0;
	}
public static void main(String[] args) {
	Lab1ex4 l=new Lab1ex4();
	l.primeNum(10);
}
}


