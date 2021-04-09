package ass;
import java.util.Scanner;
public class Lab1ex2 {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		String signal=s.nextLine();
		switch(signal) {
			case "red":
				System.out.println("Stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("Go");
				break;
			default:
					System.out.print("NA");
			}
	}
}


