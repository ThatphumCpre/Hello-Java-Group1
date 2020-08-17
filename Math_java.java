public class Math_java {
	public static void main(String[] args) {

		int num1 =  25, num2 = -25, value;

		//Find highest value of num1,num2
		value = Math.max(num1,num2);
		System.out.println(value);

		//Find lowest value of num1,num2
		value = Math.min(num1,num2);
		System.out.println(value);

		//Square root of num1
		value =(int)Math.sqrt(num1);
		System.out.println(value);

		//Fine absolute value of num2
		value = Math.abs(num2);
		System.out.println(value);

		//Random number between num2 and num1
		value = (int)(Math.random() * (num1-num2) + num2);
		System.out.println(value);

	}
}

