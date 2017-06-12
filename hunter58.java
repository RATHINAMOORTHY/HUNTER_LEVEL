import java.util.Scanner;

public class hunter58 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=in.nextInt();
		int[] a=new int[n];
		String s="";
		System.out.println("ENTER THE VALUES FOR ARRAY");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s=s.concat(String.valueOf(a[i]));
		}
		System.out.println("ENTER THE VALUE OF k");
		int k=in.nextInt();
		int k1=k*-1;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String s1=s.substring(i,j+1);
				if(s1.length()==2)
				{
					int a1=Character.getNumericValue(s1.charAt(0));
					int a2=Character.getNumericValue(s1.charAt(1));
					if(a1-a2==k||a1-a2==k1)
					{
						System.out.println(a1+","+a2+"  difference equal to  "+k);
					}
				}
			}
		}
	}
}
