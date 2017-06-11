import java.util.Scanner;

public class hunter80 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		 int count=in.nextInt();
		 System.out.println("THE JUMPING NUMBERS BETWEEN "+count+" ARE");	
		 for(int i=1;i<=count;i++)
		 {
			 int l=String.valueOf(i).length();
			 if(l==1)
			 {
				 System.out.println(i);
			 } 
			 if(i>9&&i%2==0)
			 {
				 int flag=0;
				 String s=String.valueOf(i);	
				 for(int j=0;j<l-1;j++)
				 {
					 int d=Character.getNumericValue(s.charAt(j))-Character.getNumericValue(s.charAt(j+1));
					 if(d==1||d==-1)
					 {
						 flag++;
					 }
				 }
				 if(flag==l-1)
				 {
					 System.out.println(i);	
				 }
			 }
		
			 
		 }

	}

}
