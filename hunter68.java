import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter68 {

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
		for(int i=0;i<n-1;i++)
		{
			al.add(a[i]-a[i+1]);
		}
        Collections.sort(al);
        int nn=(int)al.get(al.size()-1);
        for(int i=0;i<n-1;i++)
		{
        	int c=a[i],d=a[i+1];
			if(nn==c-d)
			{
				System.out.println(c+" - "+d+" = "+nn);
			}
		}
	}

}
