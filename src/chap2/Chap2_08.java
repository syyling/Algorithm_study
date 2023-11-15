package chap2;

import java.util.Scanner;

public class Chap2_08 {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++) {
                if(arr[i]<arr[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_08 T = new Chap2_08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
