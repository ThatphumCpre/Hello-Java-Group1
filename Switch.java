public class Switch{
	public static void main(String[] arg){

		//Change Input from string to int
		int Number = Integer.parseInt(arg[0]);

		//Number is the expression of switch
		switch(Number){
			//Check the value of expression with each case if it match it will execute the code in that block
			//Break is use break out of switch if we dont use break it will execute the code in that case and all the rest of it
			case 1: System.out.println("One");
				break;
			case 2: System.out.println("Two");
				break;
			case 3: System.out.println("Three");
				break;
			case 4: System.out.println("Four");
				break;
			case 5: System.out.println("Five");
				break;
			case 6: System.out.println("Six");
				break;
			case 7: System.out.println("Seven");
				break;
			case 8: System.out.println("Eight");
				break;
			case 9: System.out.println("Nine");
		}
	}
}
