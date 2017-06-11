
import java.util.LinkedList;
import java.util.Scanner;

public class hunter78{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LinkedList<Integer> al=new LinkedList<Integer>();
		System.out.println("ENTER THE SIZE OF LINKED LIST");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR LINKED LIST");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			al.add(a[i]);
		}
	    System.out.println("MIDDLE ELEMINT IN LINKED LIST = "+al.get(al.size()/2));

	}

}
