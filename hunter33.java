import java.util.ArrayList;
import java.util.Scanner;

public class hunter33 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("ENTER THE NUMBER TO PRESS");
		int n=in.nextInt();
		al.add("no alphabet");
		al.add("no alphabet");
		al.add("ABC");
		al.add("DEF");
		al.add("GHI");
		al.add("JKL");
		al.add("MNO");
		al.add("PQRS");
		al.add("TUV");
		al.add("WXYZ");
		System.out.println(al.get(n));
		

	}

}
