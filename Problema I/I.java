import java.util.*;

public class I {

  private HashMap<Character, Character> mappings;

  public I() {
    this.mappings = new HashMap<Character, Character>();
    this.mappings.put(')', '(');
    this.mappings.put('}', '{');
    this.mappings.put(']', '[');
  }

  public String isValid(String s) {

    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (this.mappings.containsKey(c)) {

        char topElement = stack.empty() ? '#' : stack.pop();

        if (topElement != this.mappings.get(c)) {
          return "NO";
        }
      } else {
        stack.push(c);
      }
    }

    if (stack.isEmpty()) {
      return "YES";
    } else {
      return "NO";
    }

  }
}
