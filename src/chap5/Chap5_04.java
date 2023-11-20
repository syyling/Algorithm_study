package chap5;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_04 {

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x: str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x-48); //숫자인지 판단(아스키넘버-48)
            else {
                int r = stack.pop();
                int l = stack.pop();
                if(x == '+') stack.push(l+r);
                if(x == '-') stack.push(l-r);
                if(x == '*') stack.push(l*r);
                if(x == '/') stack.push(l/r);

            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Chap5_04 T = new Chap5_04();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
