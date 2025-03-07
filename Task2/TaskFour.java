import java.util.Scanner;

public class TaskFour{
	public static void main(String [] args){
Scanner input = new Scanner(System.in);
double sum =0; 
for(int count = 1; count <= 10; count++){
System.out.print("Prompt user to enter ten scores:");
double score = input.nextDouble();
if( count % 2 ==0 ){
sum += score;

}

}
System.out.println(  "The avarage of the scores is   " + sum);

	}
}



