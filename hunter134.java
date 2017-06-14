import java.util.Scanner;

public class hunter134 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE TWO VALUES");
		int x=in.nextInt();
		int y=in.nextInt();
		int z=iscoprime(x,y);
		if(z==1)
			System.out.println("GIVEN NUMBERS ARE CO-PRIME");
		else
			System.out.println("GIVEN NUMBERS ARE NOT CO-PRIME");

	}
	public static int iscoprime(int a,int b)
	{
		while(1>0)
		{
			int temp=a%b;
			if(temp==0)
			{
				return b;
			}
			a=b;
			b=temp;
		}
	}

}
