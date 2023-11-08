package chap1;

import java.util.Scanner;

public class Chap1_11 {

    public String solution(String str) {

        char[] charArray = str.toCharArray();
        char c = charArray[0];
        int num = 0;
        String s = "";

        for(char x: charArray) {
            if(c!=x) {
                s += c;
                if (num != 1) {
                    s += Integer.toString(num);
                }
                num = 1;
            }
            else {
                num++;
            }
            c=x;
        }
        s+=c;
        if(num != 1) {
            s += Integer.toString(num);
        }
        return s;
    }

    public static void main(String[] args) {
        Chap1_11 T = new Chap1_11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
