package chap2;

import java.util.Scanner;

public class Chap2_02 {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for(int i=1; i<n; i++) {
            if(max<arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_02 T = new Chap2_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
