package chap4;

import java.util.HashMap;
import java.util.Scanner;

public class Chap4_01 {

    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = 0;
        for(char key: map.keySet()) {
            if(map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Chap4_01 T = new Chap4_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();
        System.out.println(T.solution(n, s));
    }
}
