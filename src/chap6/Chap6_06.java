package chap6;

import java.util.Arrays;
import java.util.Scanner;

public class Chap6_06 {

    public String solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();
        int[] tmp = arr.clone(); //깊은 복사
        Arrays.sort(tmp); //정렬된 배열
        for(int i=0; i<n; i++) {
            if(arr[i] != tmp[i])
                answer.append(i+1).append(" ");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Chap6_06 T = new Chap6_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
