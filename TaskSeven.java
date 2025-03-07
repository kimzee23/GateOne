public class TaskSeven{
	public static void main(String [] args){
int num = 1;
int sum = 0;
for(int count = 1; count <= 10; count++ ){
num = 1;
sum = 0;
for (int counter = 1; counter <=5; counter++){
if(count % 4 == 0 ){
	num *= count;
	sum += num;
	System.out.println(sum);	
}
}

}
	
}
}