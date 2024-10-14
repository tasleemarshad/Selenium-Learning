package learnSelenium;

public class JavaPratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number [] = {23,35,47,58,60,120};
		int sum =0 ;
		int avg ;
		
		for (int i : number) 
			sum += i;
			avg =sum / number.length;
			
		System.out.println("The sum is " + sum);
		System.out.println("The sum is " + avg);
	}
	
	// a Java program to count letters, spaces, numbers and other characters in an input string.
		
		  String mixword= "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		  int letter=0;
		  int space=0;
		  int number=0;
		  int other=0;

		  
		  char[] ch = mixword.toCharArray(); {
		  
		  for (int i= 0 ; i<mixword.length(); i++){
		  
		  if(Character.isLetter(ch[i])){
		    letter++;
		  }
		  
		  else if (Character.isSpaceChar(ch[i])){
		  space++;
		  }
		  
		  else if(Character.isDigit(ch[i])){
		    number++;
		  }
		  
		   else{
		    other++;
		  }
		  }
		  
		  System.out.println("letter:" +letter);
		   System.out.println("space:" +space);
		    System.out.println("number : " +number);
		     System.out.println("other :" +other);
		}
}



	
