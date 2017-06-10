import java.util.*;
class index3
{
	public static void main(String args[])
	{
		System.out.println("ENTER THR ARRAY LIMIT");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE VALUES IN THE ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
				System.out.println(+i);
			}
		}
	}
}