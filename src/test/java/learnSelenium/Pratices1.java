package learnSelenium;

public class Pratices1 {

	public static void main(String[] args) {
		
		// Count the word 
   String word ="Filler text is text that shares some characteristics of a real written text";
  int countwords= word.split("\\s").length;
  System.out.println(countwords);

		// Calculate table 
		int num = 5;
		for (int i=0 ; i<=10; i++)
		
		System.out.println(num+" * "+i+" = "+num*i);
		
		//SWAP NUMBER
		int x=10;
		int y=20; 
		System.out.println("Before swap value of x" + x + "Before swap value of y" +y);
		int temp =x;
		x=y;
		y= temp;
		System.out.println("After swap value of x" + x +"After swap value of y" +y);
		
		// Reverse string 
		
		String orgstr= "Hello World of java";
		String revstr ="";
		
		System.out.println("Original String  " +orgstr);
		
		for(int i=0 ; i< orgstr.length(); i++) {
			revstr= orgstr.charAt(i)+ revstr;
			System.out.println("Reversed String"  +revstr);
		}
		
		
	
// Calculate the SUM of Array
	
	int[]myArray = {1,5,7,9,11};
	int sum = 0;
	int i;
	
	for ( i=0; i < myArray.length; i++) {
		sum += myArray[i];
	}
	
	System.out.println("The sum is" +sum);

	
	
	
	
	
	
}
	}



