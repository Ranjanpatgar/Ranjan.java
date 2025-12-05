package placement1;
import java.util.Scanner;
public class Value {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);{
			System.out.println("enter the number");
			int num=Sc.nextInt();
			if(num>0) {
				System.out.println(-+(num));
			}else{
				System.out.println("invalid");
			}
		}

	}

}
