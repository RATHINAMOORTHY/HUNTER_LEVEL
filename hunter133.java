import java.util.*;
public class hunter133 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	LinkedList<String> ll=new LinkedList<String>();
	String s=in.nextLine();
	ll.add(s);
	String s1=in.nextLine();
	ll.add(s1);
    Iterator itr=ll.descendingIterator();
    while(itr.hasNext())
    {
    	System.out.print(itr.next()+" ");
    }
    
	}

}
