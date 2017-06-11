import java.util.Scanner;

public class hunter37 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		String s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int e=i;
           String s1=(s.substring(0, i)+s.substring(i+1,s.length()));
		   StringBuffer sb=new StringBuffer(s1);
		   if(s1.equals(new String(sb.reverse())))
		   {
			   System.out.println(s1+" IS THE PALINDROME BY REMOVING CHARACTER '"+s.charAt(e)+"'");
		   }
	
		}

	}

}
