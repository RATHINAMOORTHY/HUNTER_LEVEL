import java.util.Scanner;

public class hunter34 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		int n=in.nextInt();
		String s=String.valueOf(n);
		String s1="";
		int len=s.length();
		s1=s1.concat("1");
		for(int i=0;i<len;i++)
		{
			s1=s1.concat("0");
		}
		int x=Integer.valueOf(s1);
		if(n==x-1)
		{
			System.out.println("not possible");
		}
		else
		{
			System.out.println(n-1);
		}
		
	}

}
