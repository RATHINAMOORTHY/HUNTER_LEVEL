import java.util.*;
class hunter27
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=in.nextLine();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str=s.substring(i,j+1);
			    StringBuffer sb=new StringBuffer(str);
				if(!str.equals(new String(sb.reverse())))
				{
					al.add(str);					
				}
			}
		}
		int pos=0;
		String large="";
        int len=1;
        for(int i=0;i<al.size();i++)
        {
        	if(al.get(i).length()>len)
        	{
        		large=al.get(i);
        		pos=i;
        		len=al.get(i).length();
        	}
        }
		System.out.println("LARGEST SUB STRING IS "+al.get(pos)+" OF LENGTH "+len);
	}
}
				
