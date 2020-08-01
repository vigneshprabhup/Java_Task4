package Task4;
import java.util.*;

public class DuplicatesToZero {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	Integer[] a= {2,2,3,3,4,4,4,11,11,11,11};
	
	

	HashSet h1=new HashSet();
	
	int length = a.length;
			
			
	for(int i=0;i<length;i++)
	     h1.add(a[i]);
	int hashLength= h1.size();
	
	List<Integer> l1 = new ArrayList(h1);
	
	
	
	System.out.println(h1);
	
	
	for(int i= hashLength; i<length;i++)
		l1.add(i, 0);

		System.out.println(l1);
	
	}
}
