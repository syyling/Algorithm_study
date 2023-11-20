package chap5;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_02 {

    public String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();
        /*
        for(char x: str.toCharArray()) {

            if(x=='(') stack.push(x);
            else if(x == ')') {
                while(stack.peek() != '(') stack.pop();
                stack.pop();
            }
            else {
                if(stack.empty()) answer+=x;
            }
        }
         */
        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Chap5_02 T = new Chap5_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
