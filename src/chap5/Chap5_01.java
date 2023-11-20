package chap5;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_01 {

    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x: s.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.empty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.empty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Chap5_01 T = new Chap5_01();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
