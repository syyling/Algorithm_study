package chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chap5_07 {

    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char c:str1.toCharArray()) Q.offer(c);
        for(char x:str2.toCharArray()) {
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO"; //필수과목은 반드시 이수해야함
        return answer;
    }

    public static void main(String[] args) {
        Chap5_07 T = new Chap5_07();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(T.solution(str1, str2));
    }
}