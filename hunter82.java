import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter82 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE VALUE");
		int n=in.nextInt();
		String s=String.valueOf(n);
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
           int l=Integer.valueOf(s.substring(0, i)+s.substring(i+1,s.length()));
		   al.add(l);
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));

	}

}
