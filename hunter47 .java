import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class hunter47 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		HashSet<Character> hs=new HashSet<Character>();
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int count=s.split(" ").length;
		int count1=0,doub=0;
		int[] lon=new int[count];
		int x=0;
		System.out.print("1) AFTER REMOVING SPACES --> ");
        for(String s1:s.split(" "))
        {
        	System.out.print(s1);
        	lon[x++]=s1.length();
        }
        Arrays.sort(lon);
        System.out.println();
        System.out.print("2) LONGEST WORD --> ");
        for(String s1:s.split(" "))
        {
           if(s1.length()==lon[count-1])
           {
        	   System.out.print(s1+" ");
           }
        }
        System.out.println();
        int e=0,num=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        	hs.add(ch[i]);
        }
        for(char cha:ch)
        {
        	if(cha=='e')
        	{
        		e++;
        	}
        	if(cha=='.')
        	{
        		count1=count1+1;
        	}
        	if(Character.isDigit(cha))
        	{
        		num++;
        	}
        }
        System.out.println("3) NUMBER OF LETTER 'e' --> "+e);
        System.out.println("4) NUMBER OF NUMERICS  --> "+num);
        System.out.println("5) NUMBER OF DOUBLES  --> "+(ch.length-hs.size()));
        System.out.println("6) NUMBER OF WORDS --> "+count);
        System.out.println("7) NUMBER OF SENTENCE --> "+count1);
	}

}
