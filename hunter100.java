import java.util.Scanner;
import java.math.*;
public class hunter100 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		String s=in.nextLine();
		int[] a=new int[s.length()];
		int ii=0;
		for(String s1:s.split(""))
		{
			a[ii++]=Integer.valueOf(s1);
		}
		int sum=0;
		for(int i=0;i<s.length()-1;i++)
		{
			int sum1=(int)Math.pow(a[i],a[i+1]);
			sum=sum+sum1;
			System.out.print("("+a[i]+"^"+a[i+1]+")+");
			sum1=0;
		}
		String x=String.valueOf(sum+(int)Math.pow(a[s.length()-1],0));
		System.out.print("("+a[s.length()-1]+"^0)="+x);
		

	}

}
