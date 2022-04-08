import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// Check if vowels are present in a string
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		for (int i=0; i<len;i++)
		{
			if (Character.toLowerCase(str.charAt(i))=='a' || Character.toLowerCase(str.charAt(i))=='e'|| Character.toLowerCase(str.charAt(i))=='i' || Character.toLowerCase(str.charAt(i))=='o'|| Character.toLowerCase(str.charAt(i))=='u')
			{
				System.out.print("Contains vowels at "+ (i+1)+"\n");
				if (i==len)
				break;
			}
		}
	}


}
