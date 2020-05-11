package com.problems.validparentheses;

import java.util.*;

public class ValidParentheses {
  public boolean validParentheses(String s) {
    // TODO: Implement me
    // Stack st = new Stack();
    Stack<Integer> stack = new Stack<Integer>();
    // public E push(E item)
    // public E pop()
    // public E peek()
    // public boolean empty()
    // public int size()

    var PARENT_VAL = 1;
    var SQUARE_VAL = 2;
    var CURLY_VAL = 3;
    char[] chars = s.toCharArray();

    Integer temp = 0;

    for (char elem : chars) {
      if (elem == '(') {
        stack.push(PARENT_VAL);
      } else if (elem == '{') {
        stack.push(CURLY_VAL);
      } else if (elem == '[') {
        stack.push(SQUARE_VAL);
      } else if (elem == ')') {
        if (stack.empty()) {
          return false;
        } 
        temp = stack.pop();
        if (temp != PARENT_VAL){
          return false;
        }
      } else if (elem == '}') {
        if (stack.empty()) {
          return false;
        } 
        temp = stack.pop();
        if (temp != CURLY_VAL)
          return false;
      } else if (elem == ']') {
        if (stack.empty()) {
          return false;
        } 
        temp = stack.pop();
        if (temp != SQUARE_VAL)
          return false;
      }
    }
    // if stack ins't empty, return false
    return stack.empty();
  }
}