public class TaskSeven{
	public static void main(String [] args){
int sumOne = 0;
int sumTwo = 0;

int number =4;
for(int count = 0; count < 5; count++ ){
sumOne += number;
number *= 4;
}
int numberTwo = 8;
for (int counter = 0; counter < 5; counter++){
	sumTwo += numberTwo;
	numberTwo *= 8;

}

System.out.println(sumOne );
System.out.println( sumTwo);
	
}
}
