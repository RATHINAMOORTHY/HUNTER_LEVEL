import java.util.*;
class hunter115
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("ENTER THE STRING 1");
		String s1=in.nextLine();
		int size=0;
		System.out.println("ENTER THE STRING 2");
		String s2=in.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		if(l2>l1)
		{
			size=l2;
			int l=l2-l1;
			for(int i=1;i<=l;i++)
			{
				s1=s1.concat(String.valueOf(i));
			}
		}
		else if(l1>l2)
		{
			size=l1;
			int l=l1-l2;
			for(int i=1;i<=l;i++)
			{
				s2=s2.concat(String.valueOf(i));
			}
		}
		else
		{
			size=l1;
		}
			
        for(int j=0;j<size;j++)
		{
			System.out.print(s1.charAt(j));
			System.out.print(s2.charAt(j));
		}
	}
}
