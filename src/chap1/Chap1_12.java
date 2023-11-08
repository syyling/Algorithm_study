package chap1;

import java.util.Scanner;

public class Chap1_12 {

    public String solution(int n, String str) {
        String s = "";
        for(int i=0; i<str.length(); i+=7) {
            String ch = str.substring(i, i + 7);
            ch = ch.replace("#", "1");
            ch = ch.replace("*", "0");
            int num = Integer.parseInt(ch, 2);
            s += (char) num;
        }
        return s;
    }

    public static void main(String[] args) {
        Chap1_12 T = new Chap1_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
