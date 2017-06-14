import java.util.Scanner;

public class hunter60 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("ENTER THE ARRAY VALUES");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE ROTATED ARRAY VALUES");
		for(int i=0;i<n;i++)
		{
			b[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[0])
			{
				System.out.println("THE 'K' VALUE IS "+(i+1));
			}
		}

	}

}
