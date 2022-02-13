package perfact_number;

import java.util.Scanner;

public class perfactNo {

	public static void main(String[] args)
	{
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check Perfact Number or not");
		n=sc.nextInt();
		for(int i=1;i<n;i++) 
		{
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Given number is perfact Number");
		}
		else
		{
			System.out.println("Given Number is not a perfact NUmber");
		}
		
	}
	int divisor(int x)
	{
		return x;
	}
}
