import java.util.LinkedList;
import java.util.Scanner;

public class hunter59 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF LinkedList 1");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR LIST 1");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			ll.add(a[i]);
		}
		System.out.println("ENTER THE SIZE OF LinkedList 2");
		int n1=in.nextInt();
		int[] a1=new int[n1];
		System.out.println("ENTER THE ELEMENTS FOR LIST 2");
		for(int i=0;i<n1;i++)
		{
			a[i]=in.nextInt();
			ll.add(a[i]);
		}
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		for(int s:ll)
		{
			ll2.add(s);
		}
		for(int s:ll1)
		{
			ll2.add(s);
		}
		System.out.println("SUM OF TWO LINKEDLIST ------>"+ll2);
		
	}

}
