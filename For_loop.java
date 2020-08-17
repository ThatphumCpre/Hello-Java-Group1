public class For_loop{
	public static void main(String[] args){

		//the first one is execute before run the loop we use to set variable
		//the second is the condition of for loop if it is true it will run again if it is false then out of the loop
		//the third one is execute after the block of code has been execute we use to increases a value of variable in the first one
		for(int i = 0; i < 5; i++){
			System.out.println(i);
		}

		//the variable in for-each loop will be each element in array
		String[] Number = {"One", "Two", "Three", "Four", "Five"};
		for(String j : Number){
			System.out.println(j);
		}
	}
}
