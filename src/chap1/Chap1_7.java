package chap1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Chap1_7 {

    public String solution(String str) {
        String answer = "";
        String tmp = str.toUpperCase();
        char[] x = tmp.toCharArray();
        int lt=0, rt=str.length()-1;

        while(lt<rt) {
            if(x[lt] == x[rt]) {
                lt++; rt--;
            }
            else {
                answer = "NO";
                break;
            }
        }
        if(answer == "") {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap1_7 T = new Chap1_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
