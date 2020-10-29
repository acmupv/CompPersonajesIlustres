package compersilus;
import java.util.*;
public class e {
	
   	public static void main (String [] args) {
		int N, I;
	    Scanner tec = new Scanner (System.in);
	    while(tec.hasNext()){
	    	N = tec.nextInt();
		    I = tec.nextInt();

	        if(N == 0 && I == 0) break;
	        else{
	            int c1=1, c2=1;
	            while(tec.hasNext() && c1!=0 && c2!=0) {
	            	c1 = tec.nextInt();
	            	c2 = tec.nextInt();
	            	if(c1 == I) I = c2;
	            	else if (c2 == I) I = c1;
	            	
	            }
	            System.out.println(I);
	        }
	    }
	}
}
 