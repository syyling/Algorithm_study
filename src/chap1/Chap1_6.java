package chap1;

import java.util.Scanner;

//indexOf: 문자열의 처음 위치에서 특정 문자열의 index를 찾는다.
public class Chap1_6 {

    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) { //참일때만 중복 안된 상태
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap1_6 T = new Chap1_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
