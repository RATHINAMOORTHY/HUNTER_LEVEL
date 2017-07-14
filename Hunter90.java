import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hunter90 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Set<String> hs=calc(s); 
		int count1=0;
		for(String st:hs)
		{
			char[] c=st.toCharArray();
			int count=0;
			for(int i=0;i<c.length-1;i++)
			{
				if(c[i]==c[i+1])
				{
					count++;
				}
			}
			if(count==0)
			{
				count1++;
				System.out.println("VALID  :"+st);
			}
		}
		if(count1==0)
		{
			System.out.println("invalid/impossible");
		}
	}
	public static Set calc(String s)
	{
		Set<String> hs=new HashSet<String>();
		if(s==null)
		{
			return null;
		}
		else if(s.length()==0)
		{
			hs.add("");
		}
		else
		{
			char c=s.charAt(0);
			String st=s.substring(1);
			Set<String> hs1=calc(st);
			for(String w:hs1)
			{
				for(int i=0;i<=w.length();i++)
				{
					hs.add(find(w,c,i));
				}
			}
		}
		return hs;
	}
	public static String find(String s,char c,int i)
	{
		String start=s.substring(0,i);
		String end=s.substring(i);
		return start+c+end;
	}

}
