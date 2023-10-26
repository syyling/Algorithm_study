package chap1;

import java.util.Scanner;

public class Chap1_5 {

    public String solution_my(String str) {
        String s = "";
        for(int i=str.length()-1; i>=0; i--) {
            if(Character.isAlphabetic(str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        String answer = "";
        int j=0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                answer += s.charAt(j);
                j++;
            }
            else{
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        /*
        while(lt<rt) {
            if(Character.isAlphabetic(s[lt])) {
                if (Character.isAlphabetic(s[rt])) {
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++;
                    rt--;
                } else {
                    rt--;
                }
            }
            else{
                lt++;
            }
        }
         */
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) rt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Chap1_5 T = new Chap1_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
