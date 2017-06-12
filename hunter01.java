import java.util.Arrays;
import java.util.Scanner;
public class hunter01 {

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
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("THE REPEATING ELEMENTS IN ARRAY IS  "+a[i]);
			}
		}

	}

}
