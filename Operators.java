public class Operators {
	public static void main(String[] args) {

		// First if
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 =  1;

		// Second if
		int num5 = 40;
		int num6 = 50;
		int num7 = 60;
		int num8 =  1;

		//Third if
		int num9  = 70;
		int num10 = 80;
		int num11 = 90;
		int num12 =  1;


		if (num1 < num2 && num2 <= num3) { //Comparison,Logical
			num4 += num1; //Assignment
			System.out.println(num4);
			num4 = 1;
			num4 -= num1; //Assignment
			System.out.println(num4);
			System.out.println(num1 + num2); //Arithmetic
			System.out.println(num2 - num3); //Arithmetic

		}
		if (num6 > num5 || num7 >= num6) { //Comparison,Logocal
			num8 *= num5; //Assignment
			System.out.println(num8);
			num8 = 1;
			num8 /= num5; //Assignment
			System.out.println(num8);
			num8 = 1;
			System.out.println(num5 * num6);	//Arithmetic
			System.out.println(num6 / num7); //Arithmetic
		}
		if (!(num9 == num10) && !(num10 == num11)) { //Comparison,Logical
			num12 %= num9; //Assignment
			System.out.println(num12);
			num12 = 1;
			num12 ^= num9; //Assignment
			System.out.println(num12);
			num12 = 1;
			System.out.println(num9 % num10); //Arithmetic
			num11++; //Assignment
			System.out.println(num11);
			num11--; //Assignment
			System.out.println(num11);
			}
	}
}

