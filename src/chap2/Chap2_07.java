package chap2;

import java.util.Scanner;

public class Chap2_07 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]==1) {
                score++;
                answer += score;
            }
            else score = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_07 T = new Chap2_07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
