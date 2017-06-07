import java.util.*;
class hunter12
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int[] a=new int[50];
		System.out.println("ENTER THE NUMBER OF STUDENTS");
		int n=in.nextInt();
		System.out.println("ENTER THE HEIGHT OF THE STUDENTS");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE STUDENTS NUMBER");
		int x=in.nextInt();
		System.out.println("HEIGHT OF STUDENT "+(x)+" IS "+a[x-1]);
		
	}
}
