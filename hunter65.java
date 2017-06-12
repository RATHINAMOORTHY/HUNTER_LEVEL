import java.util.ArrayList;
import java.util.Scanner;

public class hunter65 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("ENTER THE ELEMENT TO BE REMOVED");
		int e=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]!=e)
			{
				al.add(a[i]);
			}
		}
		System.out.println("AFTER REMOVING THE ELEMENTS "+al);

	}

}
