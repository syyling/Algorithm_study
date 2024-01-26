package chap5;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_05 {

    public int solution(String str) {
        int answer=0;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                stack.push('(');
            }
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap5_05 T = new Chap5_05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}