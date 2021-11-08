package exception;

import java.util.Scanner;

public class excptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
       /*try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't devide by 0");
			
		}*/
		try {
			throw new UnsupportedOperationException();
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("can't devide by 0");
		}

	}

}
