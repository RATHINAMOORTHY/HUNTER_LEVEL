import java.util.*;
class hunter103
{
	public static void main(String args[])
	{
		
	    System.out.println("ENTER THR NUMBER");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>9)
		{
		String s=String.valueOf(n);
		int sum=0;
		for(String s1:s.split(""))
		{
			int x=Integer.valueOf(s1);
			int pro=1;
			for(int i=0;i<s.length();i++)
			{
				pro=pro*x;
			}
			sum=sum+pro;
		}
		System.out.println("SUM OF PRODUCTS = "+sum);
		}
		else
		{
			System.out.println("ENTER THR NUMBER GREATER THAN 9");
		}
	}
}
		
