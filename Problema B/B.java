import java.io.PrintWriter;
import java.util.*;

public class B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = Integer.parseInt(sc.nextLine().trim());
    List<Integer> x = new LinkedList<>();
    
    while(sc.hasNext()) {
      x.add(sc.nextInt());
    }

    pw.print(func(n, x));

    sc.close();
    pw.close();

  }

  public static int func(int n, List<Integer> x) {
    int[] cache = new int[n + 1];
    cache[0] = 1;
    
    for (int i = 0; i < n + 1; i++) {
      for (Integer aux : x) {
        if (i - aux >= 0) {
          cache[i] += cache[i - aux];
        }
      }
    }
    
    return cache[n];
  }
}