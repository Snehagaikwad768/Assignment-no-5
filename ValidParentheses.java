/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
     public static boolean isValid(String str) {    
    Map<Character, Character> parenthesesMapping = new HashMap<>();
    parenthesesMapping.put('(', ')');
    parenthesesMapping.put('{', '}');
    parenthesesMapping.put('[', ']');

    Stack<Character> parentheses = new Stack<>();
    for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(parenthesesMapping.containsKey(c)) {
            parentheses.push(c);    
        } else {
            if(parentheses.isEmpty()) {
                return false;
            }
            char target = parentheses.pop();
            if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
                return false;
            }
            }
    }
    if(!parentheses.isEmpty()) {
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isValid("([)]"));
  }
}

