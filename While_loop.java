public class While_loop{
	public static void main(String[] arg){
		int i = 0, j = 0;

		//while loop will loops through a block of code as long as the condition is true
		while (i < 5){
			System.out.println(i);
			i++;
		}

		//do while loop will do the block of code one time before checking the condition of while loop
		//&& is an and in boolean expression
		do{
			System.out.println(j);
			j++;
		}while(j < 5 && j > 0);
	}
}
