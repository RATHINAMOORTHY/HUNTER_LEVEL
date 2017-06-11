import java.util.Scanner;

public class hunter7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		String s1="";
		System.out.println("ENTER THE ELEMENTS FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s1=s1.concat(String.valueOf(a[i]));
		}
		for(String s2:s1.split(""))
		{
			int len=s1.length()-s1.replaceAll(s2, "").length();
			if(len==1)
			{
				System.out.println("THE DISTINCT ELEMENT IS "+s2);
			}
		}
	}

}
