import java.util.Scanner;

public class hunter49 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF N");
		int s1=in.nextInt();
		System.out.println("ENTER THE VALUE OF K");
		int s2=in.nextInt();
		String s="";
		for(int i=1;i<=s1;i++)
		{
			s=s.concat(String.valueOf(i));
		}
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sx=s.substring(i,j+1);
				if(sx.length()==s2)
				{
					System.out.print("[ ");
					for(int k=0;k<s2;k++)
					{
						System.out.print(sx.charAt(k));
					}
					System.out.print(" ]");
					System.out.println();
				}
			}
		}
	}
}
