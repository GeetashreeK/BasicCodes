import java.util.Scanner;
public class CompareStrings {

	public static void main(String[] args) {
		// Check two string arrays and print the unique values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		System.out.println("Unique characters: ");
		int len;
		String str=str1+str2;
		String s=str.toUpperCase();
		String s2=str2.toUpperCase();
		String s1=str1.toUpperCase();
		if(str1.length()>str2.length()) {
			len=str1.length();
		}
		else {
			len=str2.length();
		}
		//System.out.println(len);
		for (int i=0;i<=len-1;i++)
		{
			//System.out.println(i);
		if(s.indexOf(Character.toUpperCase(s2.charAt(i)))==-1)
		{		
			System.out.println(str2.charAt(i));
		}
		else if(s.indexOf(Character.toUpperCase(s1.charAt(i)))==-1)
		{			
			System.out.println(str1.charAt(i));
		}
		}
	}
	

}
