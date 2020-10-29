import java.util.*;

public class c {
	
	public static String desencriptar(int k, String s) 
	{
		String res="";
		char ch;
		for (int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			if (ch>='a' && ch <='z') {
				ch = (char)(ch - k);
				if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            res += ch;
			} else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - k);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            res += ch;
	        }
	        else {
	            res += ch;
	        }
	    }

	    return res;  
		}
	
	public static void main (String [] args) {
		Scanner tec = new Scanner (System.in);
		int k = tec.nextInt();
		String string = tec.nextLine();
		System.out.println(desencriptar(k, string));
	}
}
