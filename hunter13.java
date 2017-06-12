import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class hunter13 {

	public static void main(String[] args) {
		LinkedList<Character> ll=new LinkedList<Character>();
		String s="";
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF LinkedList");
		int n=in.nextInt();
		char[] a=new char[n];
		System.out.println("ENTER THE ELEMENTS FOR LinkedList");
		for(int i=0;i<n;i++)
		{
			a[i]=in.next().charAt(0);
			ll.add(a[i]);
		}
		for(char c:ll)
		{
			s=s.concat(String.valueOf(c));
		}
		StringBuffer sb=new StringBuffer(s);
		if(s.equals(new String(sb.reverse())))
		{
			System.out.println("THE LinkedList IS PALINDROME");
		}
		else
		{
			System.out.println("THE LinkedList IS NOT A PALINDROME");
		}
		

	}

}
