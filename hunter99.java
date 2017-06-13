import java.util.*;
class hunter99
{
	public static void main(String args[])
	{
		System.out.println("ENTER THE NUMBER");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			int b=isprime(i);
			if(b==0)
				al.add(i);
		}
		int jj=0;
		int[] a=new int[al.size()];
		for(int i:al)
		{
			a[jj++]=(int)i;
		}
		for(int i=0;i<al.size();i++)
		{
			int b=a[i];
			{
				for(int j=0;j<al.size();j++)
				{
					int c=a[j];
					if(i!=j)
					{
						if(a[i]+a[j]==n)
						{
							System.out.println(a[i]+" + "+a[j]+" = "+n);
						}	
					}
				}
			}
		}
	}
	public static int isprime(int a)
	{
		int flag=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return 0;
		else
		  return 1;
	}
}
