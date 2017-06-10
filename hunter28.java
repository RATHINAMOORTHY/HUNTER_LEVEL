import java.util.*;
class hunter28
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		HashSet<Character> hs=new HashSet<Character>();
		System.out.println("ENTER THE STRING");
		String s=in.nextLine();
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			hs.add(c);
		}
		for(char c:hs)
		{
			System.out.print(c);
		}
		
	}
}
			