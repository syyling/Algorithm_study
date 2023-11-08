package chap1;

import java.util.Scanner;

public class Chap1_03 {

    public String solution(String str) {
        String answer = "";
        String[] split = str.split(" ");
        int max = 0;
        for(String word: split) {
            int length = word.length();
            if(max<length) {
                max = length;
                answer = word;
            }
        }
        return answer;
    }

    /*
    public String solution(String str) {
        String answer ="";
        int m = Integer.MIN_VALUE;
        int pos;

        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m) {
                m=len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) {
            answer = str;
        }
        return answer;
    }
     */

    public static void main(String[] args) {
        Chap1_03 T = new Chap1_03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //한줄로 입력받음
        System.out.println(T.solution(str));
    }
}
