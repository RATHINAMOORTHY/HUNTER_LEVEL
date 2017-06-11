import java.util.Scanner;

public class hunter55 {

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
			s=s+String.valueOf(a[i]);
		}
		System.out.println("ENTER THE ROTATE VALUE");
		int r=in.nextInt();
		String fin=s.substring(r, s.length())+s.substring(0,r);
		for(String fin1:fin.split(""))
		{
			System.out.print(fin1+" ");
		}
	}

}
