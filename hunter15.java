import java.util.Arrays;
import java.util.Scanner;

public class hunter15 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY'S");
		int n=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		int[] d=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY 1");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE ELEMENTS FOR ARRAY 2");
		for(int i=0;i<n;i++)
		{
			b[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		Arrays.sort(c);
		int min=c[c.length-1];
		for(int i=0;i<n;i++)
		{
			if((a[i]+b[i])==min)
			{
				System.out.println("SUB ARRAY WITH MAXIMUM SUM IS ----> "+a[i]+"+"+b[i]+"="+min);
				break;
			}
		}
	}

}
