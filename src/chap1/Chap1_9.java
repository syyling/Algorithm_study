package chap1;

import java.util.Scanner;

public class Chap1_9 {

    public int solution(String str) {
        String s = str.toUpperCase().replaceAll("[A-Z]", "");
        int num = Integer.parseInt(s);
        return num;
    }

    public static void main(String[] args) {
        Chap1_9 T = new Chap1_9();
        Scanner kb= new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
