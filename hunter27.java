import java.util.*;
class hunter27
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=in.nextLine();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str=s.substring(i,j+1);
			    StringBuffer sb=new StringBuffer(str);
				if(!sb.equals(sb.reverse()))
				{
					al.add(str.length());
				}
			}
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}
}
					
