package foodProgam;

import java.util.Scanner;

public class food_progam2 {

	public static void main(String[] args) {
		 int num,num2,num3;
		 num = 1;
		 num2 = 2;
		 num3 = 3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("what food would you like? if you would like quit type quit");
		System.out.println("1. cheseburger £4.49, 2.chips	£1.50	, 3.chicken wings £1.99 , ");
		int userinput = input.nextInt();
		
			if (userinput == num){
				 
				
				System.out.println("you have  ordderd a cheese burger ");
				}
				  else if(userinput == num2){
					System.out.println("you orderd fries ");
				}
				else if (userinput == num3){
					System.out.println("you  ordered some chicken wings" );
				}
				else{
					System.out.println("please try again ");
				}
				
							
				}
				
						
					

		}
			
		
		
		




	
		
	
			
		
		
		
		
		

	

