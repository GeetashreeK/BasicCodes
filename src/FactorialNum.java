import java.util.Scanner;
public class FactorialNum {
	public static void main(String[] args) {
		
		// Factorial of a Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		long fact=1;
		for(int i=1; i<=num;i++)
		{
			fact=fact*i;
			System.out.println(fact+" "+i);
		}
		System.out.println(fact);
	}
	
}
