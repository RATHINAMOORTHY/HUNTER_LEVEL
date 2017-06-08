import java.util.*;
class reverse93
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		for(String str:s.split(" "))
		{
			StringBuffer sb=new StringBuffer(str);
			System.out.print(sb.reverse()+" ");
		}
	}
}
