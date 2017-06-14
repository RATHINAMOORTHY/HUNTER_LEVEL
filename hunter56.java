import java.util.*;
public class hunter56 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ARRAY VALUES");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					al.add(a[i]+a[j]);
				}
			}
		}
		Collections.sort(al);
		int flag=0;
		int sum=(int)al.get(0);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(a[i]+a[j]==sum&&flag==0)
					{
						System.out.println(a[i]+"  "+a[j]+"----->"+sum);
						flag++;
					}
				}
			}
		}
		

	}

}
