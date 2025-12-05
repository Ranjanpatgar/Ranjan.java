package placement1;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<=12) {
			System.out.println("kid");
		}else if(age>=13 && age<19) {
			System.out.println("teenage");
		}else if(age>=20 && age<40) {
			System.out.println("youngster");
		}else if(age>=40 && age<55) {
			System.out.println("aged man");
		}else if(age>70) {
			System.out.println("old");
		}else {
			System.out.println("invalid");
		}

	}

}
