import java.util.Scanner;

public class hunter122 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		if(a.length%2!=0)
		{
			int sum1=0,sum2=0;
			for(int i=0;i<a.length/2;i++)
			{
				sum1=sum1+a[i];
			}
			for(int i=a.length/2+1;i<a.length;i++)
			{
				sum2=sum2+a[i];
			}
			if(sum1==sum2)
			{
				System.out.println("CENTER VALUE IS "+a[a.length/2]);
			}
			
		}
		if(a.length%2==0)
		{
			int sum1=0,sum2=0;
			for(int i=0;i<a.length/2;i++)
			{
				sum1=sum1+a[i];
			}
			for(int i=a.length/2+1;i<a.length;i++)
			{
				sum2=sum2+a[i];
			}
			if(sum1==sum2)
			{
				System.out.println("CENTER VALUE IS "+a[a.length/2]);
			}
			
		}

	}

}
