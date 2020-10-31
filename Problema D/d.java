import java.util.*;

public class D {

	public static void main(String [] args){
	    
	    Scanner tec = new Scanner (System.in);
	    int N = tec.nextInt();

	    for(int caso = 0; caso < N; caso++){
	        int d1, d2;

	        d1 = tec.nextInt();
	        d2 = tec.nextInt();

	        if(d1 > d2){
	            int temp = d1;
	            d1 = d2;
	            d2 = temp;
	        }

	        int a;
	        for(a=0; a < d2-d1; a++) System.out.print(d1 + a + 1 + " "); 
	        System.out.print(d1 + a+1);

	        System.out.println();
	    }

	}
}
