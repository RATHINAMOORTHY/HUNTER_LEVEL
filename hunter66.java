import java.util.ArrayList;
import java.util.Scanner;

public class hunter66 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY LIST");
		int n=in.nextInt();
		in.nextLine();
		int count=0;
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0;i<n;i++)
		{
			String s=in.nextLine();
			if(s.length()!=2)
			{
				String s1=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1));
				if(s1.equals("10"))
				{
					count++;
				}
			}
		}
		System.out.println("ENTER THE ELEMENTS with prefix 01 is "+count);

	}

}
