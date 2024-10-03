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

}
