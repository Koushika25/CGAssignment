package ass;

public class Lab1ex5 {
	int sum=0;
	public int calculateSum(int n){
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
			sum=sum+i;
			}
		}
		//System.out.println(sum);
		return sum;
}
	public static void main(String[] args) {
		Lab1ex5 l = new Lab1ex5();
		System.out.println(l.calculateSum(5));
		
	}
}


