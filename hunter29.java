import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter29 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
			}
			al.add(sum);
		}
		Collections.sort(al);
		int s=(int)al.get(al.size()-1);
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
			}
				if(sum==s)
				{
					for(int k=i;k<n;k++)
					{
						System.out.print(a[k]+"+");
					}
					System.out.print("= "+sum);
				}
		}

	}

}
