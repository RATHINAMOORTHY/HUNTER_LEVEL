import java.util.*;
class hunter124
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("ENTER THE STRING");
		String s1=in.nextLine();	
		int flag=0;
        for(int j=0;j<s1.length();j++)
		{
			if(Character.isUpperCase(s1.charAt(j)))
			{
				++flag;
			}
		}
		if(flag==2)
		    System.out.println("it is a CamelCase");
	    else
			System.out.println("it is not a CamelCase");
	}
}
