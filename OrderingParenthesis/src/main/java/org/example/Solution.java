package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public static boolean checkParenthesis(String s){

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapPar = new HashMap<>();
        mapPar.put(')', '(');
        mapPar.put(']', '[');
        mapPar.put('}', '{');
        int i = 0;
        while (i < s.length()){
            if (mapPar.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            if (mapPar.containsKey(s.charAt(i)) && (stack.empty() || stack.pop() != mapPar.get(s.charAt(i)))) {
                return false;
            }
            i++;
        }
        return stack.empty();
    }
}
