public class Type_casting{
	public static void main(String[] args){
		int myInt = 9;
		double myDouble = myInt;      //Automatic casting : int -> double
		System.out.println(myDouble); //output : 9.0
		System.out.println(myInt);    //output : 9
		
		double myDoubleTwo = 9.85; 
		int myNewInt = (int) myDoubleTwo;  //Manual casting : double -> int
		System.out.println(myDoubleTwo);   //output : 9.85
		System.out.println(myInt); 	   //output : 9 
	}
}
