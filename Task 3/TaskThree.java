import java.util.Scanner;


public class TaskThree{
	public static void main(String[]args){
int[] scores = new int[11];
Scanner scanner = new Scanner(System.in);
       
        
        for (int count = 1; count < scores.length; count++) {
	 System.out.println("Prompt the user to enter  10 scores:");
            System.out.print("Score " + count + ": ");
            scores[count] = scanner.nextInt();

        }
System.out.println( "\n =================================================================");
System.out.println( "\n printing  in Horizontally");
for(int score : scores)
	System.out.print(score);
    }
}
