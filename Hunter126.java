import java.util.*;
public class Hunter126 {
    public static void main(String args[]) {
       String s="";
       Set<String> ss=new HashSet<String>();
       for(String st:args)
       {
           int num=Integer.valueOf(st);
           char c=(char)num;
           ss.add(String.valueOf(c));
           s=s+c;
       }
       for(String st:ss)
       {
           int count=s.length()-s.replaceAll(st,"").length();
           System.out.println(st+" is "+count+" times");
       }
    }
}
