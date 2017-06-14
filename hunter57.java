import java.util.Arrays;
import java.util.Scanner;

public class hunter57 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		String s="";
		System.out.println("ENTER THE ARRAY VALUES");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s=s.concat(String.valueOf(a[i]));
		}
		Arrays.sort(a);
		for(String st:s.split(""))
		{
			if(s.length()-s.replaceAll(st,"").length()==1)
			{
				System.out.println("SINGLE OCCURANCE VALUE IS "+st);
			}
		}

	}

}
