import java.util.Arrays;
import java.util.Scanner;

public class hunter96 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		String s1=in.nextLine();
		int flag=0;
		char[] c="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(String sx:s1.split(""))
		{
			char ch=sx.charAt(0);
			if(ch=='a'&&flag==0)
			{
				++flag;
				System.out.print(c[25]);
			}
			else if(ch=='a'&&flag!=0)
			{
				flag=0;
				System.out.print(c[0]);
			}
			else
			{
				int pos=Arrays.binarySearch(c,ch);
				System.out.print(c[pos-1]);
				
			}
		}

	}

}
