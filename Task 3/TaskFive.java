import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        int[] scores = new int[11];
        Scanner scanner = new Scanner(System.in);

        for (int count = 1; count < scores.length; count++) {
            System.out.println("Prompt the user to enter 10 scores:");
            System.out.print("Score " + count + ": ");
            scores[count] = scanner.nextInt();
        }

        System.out.println("\n=================================================================");
        System.out.println("\nPrinting in horizontally");
        for (int score : scores) {
            System.out.print("[" + score  +  "]" + " " );
        }
	   System.out.println("\n\n The odd elements are:");
	   int[] evenIndexElements = getEvenIndexElements(scores);
	   for(int evenNumber : evenIndexElements ){
	  	System.out.print(evenNumber + " ");
}

        System.out.println("\n\n The odd elements are:");
        int[] oddIndexElements = getOddIndexElements(scores);
        for (int element : oddIndexElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] getOddIndexElements(int[] array) {
  
        int arrayLength = array.length / 2;
        int[] result = new int[arrayLength];
        int index = 0;

        for (int count = 1; count < array.length; count += 2) {
            result[index++] = array[count];
        }

        return result;
    }
 public static int[]getEvenIndexElements(int[] array){
	int arrayLengthTwo = array.length/3;
	int[] output = new int[ arrayLengthTwo];
	int index = 0;
for(int counter  = 1; counter < array.length; counter +=3){
	output[index++] = array[counter];
}
return output;
}

}
