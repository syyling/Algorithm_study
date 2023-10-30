package chap1;

import java.util.Scanner;

public class Chap1_8 {

    public String solution(String str) {
        String answer = "NO";

        //replaceAll 정규식 사용, replace 정규식 사용 못함
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverse = stringBuilder.reverse().toString();
        if(s.equals(reverse)) {
            answer ="YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap1_8 T = new Chap1_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
