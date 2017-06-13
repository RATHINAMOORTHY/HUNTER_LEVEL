import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter62 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE SHARE LENGTH VALUE");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE SHARE VALUES");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int b=a[i];
			{
				for(int j=0;j<n;j++)
				{
					int c=a[j];
					if(i!=j)
					{
						al.add(a[i]-a[j]);
					}
				}
			}
		}
		Collections.sort(al);
		int max=(int)al.get(al.size()-1);
		for(int i=0;i<n;i++)
		{
			int b=a[i];
			{
				for(int j=0;j<n;j++)
				{
					int c=a[j];
					if(i!=j)
					{
						if(a[i]-a[j]==max)
						{
							System.out.println(a[i]+" - "+a[j]+" = "+max);
							break;
						}
					}
				}
			}
		}

	}

}
