package placement1;
import java.util.Scanner;
public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the score of team A");
		int score1=sc.nextInt();
		System.out.println("enter the score of team B");
		int score2=sc.nextInt();
		if(score1 > score2 && score1<score2+7) {
			System.out.println("team A is winner ");
		}else if(score1 <score2 && score2<score1+7) {
			System.out.println("team B is winner");
		}else if(score1 ==score2){
			System.out.println("match is tie");
		} else{
			System.out.println("invalid score");
	
		}
		
	}

}
