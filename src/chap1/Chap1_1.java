package chap1;

import java.util.*;
class Chap1_1{
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char c : str.toCharArray()) {
            if(c==t) {
                answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Chap1_1 T = new Chap1_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));

    }
}