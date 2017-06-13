import java.util.Scanner;

public class hunter83 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRING to ENCODE");
		String e=in.nextLine();
		System.out.println("ENTER THE STRING to DECODE");
		String d=in.nextLine();
		char[] ce=e.toCharArray();
		char[] cd=d.toCharArray();
		int po=0,po1=0,c=0;
		for(int i=0;i<ce.length-2;i++)
		{
			if(Character.isDigit(ce[i])&&ce[i+1]=='x'&&Character.isLetter(ce[i+2]))
			{
				System.out.println("ENCODED STRING IS");
				System.out.print(e.substring(0,i));
				for(int ii=0;ii<Character.getNumericValue(ce[i]);ii++)
				{
					System.out.print(ce[i+2]);
				}
				System.out.print(e.substring(i+3,e.length()));
			}
		}
		System.out.println();
		System.out.println("DECODED STRING IS");
		String sz="";
		for(int i=0;i<cd.length;i++)
		{
			if(cd[i]==cd[i+1])
			{
				System.out.print(d.substring(0,i));
				sz=d.substring(i,d.length());
				po=i+1;
				break;
			}
		}
		String sr=d.substring(po,d.length());
		char cv=sr.charAt(0);
		for(int i=0;i<sr.length();i++)
		{
			if(cv!=sr.charAt(i))
			{
				po1=i;
				break;
			}
			c++;
		}
		System.out.print((c+1)+"x"+cv);
		System.out.print(sr.substring(po1,sr.length()));
	}

}
