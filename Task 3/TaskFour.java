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

        System.out.println("\n\nElements at odd indices:");
        int[] oddIndexElements = getOddIndexElements(scores);
        for (int element : oddIndexElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] getOddIndexElements(int[] array) {
  
        int size = array.length / 2;
        int[] result = new int[size];
        int index = 0;

        for (int i = 1; i < array.length; i += 2) {
            result[index++] = array[i];
        }

        return result;
    }
}
