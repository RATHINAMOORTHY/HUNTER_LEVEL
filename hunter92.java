import java.util.*;
class hunter92
{
	public static void main(String args[])
	{
		 ArrayList<String> al=new ArrayList<String>();
		System.out.println("ENTER A STRING WITH LARGE SPACES");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
				for(String s1:s.split(" "))
				{
					al.add(s1);
				}
				for(String ss:al)
				{
						System.out.print(ss);
				}
	}
}