import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
class hunter88
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        Set<String> ts=new LinkedHashSet<String>();
        for(String s1:s.split(""))
        {
        	ts.add(s1);
        }
        String df="";
        for(String sd:ts)
        {
        	df=df+sd;
        }
        StringBuffer sb=new StringBuffer(df);
        System.out.print(sb.reverse());
    }
}
