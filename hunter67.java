import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class hunter67 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY LIST");
		int n=in.nextInt();
		in.nextLine();
		int o=0;
		int[] len=new int[n];
		System.out.println("ENTER THE ELEMENTS FOR ARRAY LIST");
		for(int i=0;i<n;i++)
		{
			al.add(in.nextLine());
		}
		for(String s2:al)
		{
			int len1=s2.length()-8;
			String s3=s2.substring(len1, s2.length());
			int sum=0;
			for(String s4:s3.split("#"))
			{
				sum=sum+Integer.valueOf(s4);
			}
			len[o++]=sum;
			al1.add(sum);
		}
        Arrays.sort(len);
		int pos=al1.indexOf(len[len.length-1]);
		System.out.println(al.get(pos)+" ---> HIGHEST MARK IS "+len[len.length-1]);
	}
}
