import java.util.*;
public class hunter132 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF LINES");
		int n=in.nextInt();
		int n1=n;
		for(int i=0;i<=n;i++)
		{   
			n1--;
			for(int j=0;j<2;j++)
			{
				for(int k=n1;k>=0;k--)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
