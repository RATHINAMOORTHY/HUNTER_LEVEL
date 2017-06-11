import java.util.ArrayList;
import java.util.Scanner;

public class hunter45 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF STRING ARRAY");
		int n=in.nextInt();
		String[] a=new String[n+1];
		String s="";
		System.out.println("ENTER THE STRINGS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.next();
			s=s.concat(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			int l=0;
			String s1=a[i];
			for(int j=0;j<n;j++)
			{
				l=s.length()-s.replaceAll(s1, "").length();
				if(l==s1.length())
				{
					System.out.println("FIRST NON REPEATING ="+s1);
					break;
				}
			}
		}

	}

}
