import java.util.Scanner;

public class hunter35 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		if(s.length()%2==0)
		{
			if(s.substring(0, s.length()/2).equals(s.substring(s.length()/2,s.length())))
			{
				System.out.print("IT IS DOUBLE STRING");
			}
			else
			{
				System.out.print("IT IS NOT A DOUBLE STRING");
			}
		}
		else
		{
			System.out.print("IT IS NOT A DOUBLE STRING");
		}

	}

}
