package chap1;

import java.util.Scanner;

public class Chap1_02 {

    public String solution(String str) {
        String answer = "";
        for(char c: str.toCharArray()) {
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
            else {
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }

    /*
    public String solution(String str) {
        String answer = "";
        for(char c: str.toCharArray()) {
            if(x>=97 && x<=122) {
                answer += (char) (x-32);
            }
            else{
                answer += (char) (x+32);
            }
        }
        return answer;
    }
     */

    public static void main(String[] args) {
        Chap1_02 T = new Chap1_02();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(T.solution(str));
    }
}
