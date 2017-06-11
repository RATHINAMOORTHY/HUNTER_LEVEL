import java.util.Scanner;

public class hunter125 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING ");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sa=s.substring(i, j+1);
				StringBuffer sb=new StringBuffer(sa);
				String sx=new String(sb.reverse());
				if(sa.equalsIgnoreCase(sx))
				{
					if(sx.length()!=1)
					{
						System.out.println(sx);
					}
					
				}
			}
		}

	}

}
