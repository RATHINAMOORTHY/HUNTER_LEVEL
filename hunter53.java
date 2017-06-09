import java.util.*;
class hunter53
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=in.nextInt();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String str=s.substring(i,j+1);
                if(str.length()==n)
                {
                        al.add(str);
                }
            }
        }
           for(String st:al)
           System.out.println(st);
    }
}


