package anudip;

import java.util.Scanner;

public class Calculator {
	
	public static int addition(int a,int b)
	{
		int c=a+b;
				return c;
	}
	
	public static int substraction(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public static int multification(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public static int division(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args)
	{
		int choice,num1,num2;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println(" Press 1 for Addition\nPress 2: for Substraction\nPress 3: for Multification\nPress 4: for Division");
			System.out.println("===============================================");
			System.out.println(" Enter your choice");
			choice=sc.nextInt();
			System.out.println("================================================");
			
			switch(choice)
			{
			case 1:System.out.println(" Enter the two nummber:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int result=Calculator.addition(num1, num2);
			System.out.println(" Addition value is : "+ result);
			System.out.println("=====================================");
			
			break;
			
			case 2:System.out.println(" Enter the two nummber:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int result1=Calculator.substraction(num1, num2);
			System.out.println(" substraction value is : "+ result1);
			System.out.println("=====================================");
			
			break;
			
			case 3:System.out.println(" Enter the two nummber:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int result2=Calculator.multification(num1, num2);
			System.out.println(" multification value is : "+ result2);
			System.out.println("=====================================");
			
			break;
			
			case 4:System.out.println(" Enter the two nummber:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int result3=Calculator.division(num1, num2);
			System.out.println(" division value is : "+ result3);
			System.out.println("=====================================");
			
			break;
			
			case 5:break;
			default:System.out.println("Wrong choice!!please choose option from given list");
			}
			
		}
		while(choice!=5);
		System.out.println(" Thank You");
		
	}
}
	
	