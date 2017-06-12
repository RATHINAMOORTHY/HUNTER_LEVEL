import java.util.Arrays;
import java.util.Scanner;
public class hunter01 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		String s="";
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s=s.concat(String.valueOf(a[i]));
		}
		System.out.println("ENTER THE TARGET INTEGER T");
		int t=in.nextInt();
		if(s.contains(String.valueOf(t)))
		{
			System.out.println("T IS PRESENT IN THE ARRAY");
		}
		System.out.println("SUB ARRAYS EQUAL TO T IS");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String s1=s.substring(i,j+1);
			    int sum=0;
			    for(String str:s1.split(""))
			    {
			    	sum=sum+Integer.valueOf(str);
			    }
			    if(sum==t)
			    {
			    	for(String str:s1.split(""))
				    {
			    		System.out.print(str+" ,");
				    }
			    	System.out.print(" = "+sum);
			    	System.out.println();
			    }
			}
		}
	}

}
