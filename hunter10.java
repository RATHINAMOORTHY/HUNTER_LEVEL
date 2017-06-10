import java.util.*;
class hunter10
{
	public static void main(String args[])
	{
		
	    System.out.println("ENTER THR 1st ARRAY LIMIT");
		Scanner in=new Scanner(System.in);
		String s1="";
		String s2="";
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE VALUES IN THE ARRAY 1");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s1=s1+String.valueOf(a[i]);
		}
		System.out.println("ENTER THR 1st ARRAY LIMIT");
		int n1=in.nextInt();
		int[] a1=new int[n1];
		System.out.println("ENTER THE VALUES IN THE ARRAY 2");
		for(int i=0;i<n1;i++)
		{
			a1[i]=in.nextInt();
			s2=s2+String.valueOf(a1[i]);
		}
		if(s2.contains(s1))
		{
			System.out.println("a1 IS A SUBSET OF a2");
		}
		else
		{
			System.out.println("a1 IS NOT A SUBSET OF a2");
		}
		
	}
}