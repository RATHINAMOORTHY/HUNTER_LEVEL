import java.util.Scanner;

public class hunter85 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int n=in.nextInt();
		int c=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			String s=String.valueOf(i);
			if(s.contains("2"))
			c++;
		}
		System.out.println("NUMBER OF 2's = "+c);
		

	}

}
