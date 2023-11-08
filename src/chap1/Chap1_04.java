package chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap1_04 {

    public ArrayList<String> solution(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String word: str) {
            String reverse ="";
            for(int i=word.length()-1; i>=0; i--) {
                reverse += word.charAt(i);
            }
            answer.add(reverse);
        }
        return answer;
    }

    //StringBuilder - 값을 수정해도 객체가 새로 생성되지 않아서 메모리 낭비 적음
    public ArrayList<String> solution_StringBuilder(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    //직접뒤집기: 왼쪽 lt 오른쪽 rt
    public ArrayList<String> solution_3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt) {
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap1_04 T = new Chap1_04();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        //동적배열 생성
        String[] str = new String[num];

        for(int i=0; i<num; i++) {
            str[i] = kb.next();
        }

        for(String x: T.solution(num, str)) {
            System.out.println(x);
        }
    }
}
