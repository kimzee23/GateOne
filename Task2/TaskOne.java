import java.util.Scanner;

public class TaskOne{
	public static void main(String [] args){
Scanner input = new Scanner(System.in);
double sum =0;
double scores = 0; 
for(int count = 0; count < 10; count++){
System.out.print("Prompt user to enter ten scores:");
double score = input.nextDouble();
sum += score;
scores++;



}
System.out.print("The sum of all the scores is   " + sum);

	}
}