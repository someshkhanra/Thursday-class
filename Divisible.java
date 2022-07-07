//1.write a program to to check if the number is divisible by 5 and 11 or not ?
package anudip;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
			int number;
			Scanner sc=new Scanner(System.in);
			{
				System.out.print( " Please enter any nummber ");
				number = sc.nextInt();
				
				if((number %5 == 0) && (number %11 == 0))
				{
					System.out.println("\n Given number" + number + "is divisible by 5 and 11" );
				}
				else
				{
					System.out.println("\n Given number" + number + " is not dividible by 5 and 11");
				}
			}
			
			
		}
		

	}

