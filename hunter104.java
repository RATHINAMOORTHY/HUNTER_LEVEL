import java.util.Scanner;

public class hunter104 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<=100&&l2<=100)
		{
			if(l1>l2)
			{
				int a=l1-l2;
				for(int i=0;i<a;i++)
				{
					s2=s2+" ";
				}
			}
			if(l2>l1)
			{
				int a=l2-l1;
				for(int i=0;i<a;i++)
				{
					s1=s1+" ";
				}
			}
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			for(int i=0;i<s1.length();i++)
			{
				System.out.println(c2[i]+""+c1[i]);
			}
		}

	}

}
