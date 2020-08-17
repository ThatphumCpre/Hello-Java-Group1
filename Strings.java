public class Strings {
	public static void main(String[] args) {

		String text1 = "Hello World";
		String text2 = "Hello Java" ;
		System.out.println(text1);
		System.out.println(text1.toUpperCase()); //Uppercase
		System.out.println(text1.toLowerCase()); //Lowercase
		System.out.println(text1.indexOf("W")); //index of w
		System.out.println(text1 +" "+ text2); // String Concatenation // Adding String
		System.out.println(text1.concat(text2)); //another form of +
		System.out.println("This text\'s for example of \"special Characters\" \\ ");
		System.out.println("Example of \n\\n"); //New line
		System.out.println("asdjakslfha \rthis is example of \\r"); // Carriage Return
		System.out.println("Example of\t\\t"); // Tab
		System.out.println("Example of 5\b\\b"); //Backspace
		System.out.println("Example of \f\\f"); //from feed
	}
}
