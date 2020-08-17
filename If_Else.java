public class If_Else {
	public static void main(String[] args){

		//Change input from string to int
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		//check if number1 < number2
		if (num1 < num2){
			System.out.println(num1 + " is less than " + num2);
		}
		//check if number1 = number2
		else if (num1 == num2){
			System.out.println(num1 + " is equal to " + num2);
		}
		//check if number1 > number2
		else{
			System.out.println(num1 + " is greater than " + num2);
		}

		//check if number1 > number2 if true result = greater, if false result = less
		String result = (num1 > num2) ? "Number1 is greater than Number2":"Number1 is less than Number2";
		System.out.println(result);
	}
}
