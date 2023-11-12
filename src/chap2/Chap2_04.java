package chap2;

import java.util.Scanner;

public class Chap2_04 {

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Chap2_04 T = new Chap2_04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i: T.solution(n)){
            System.out.print(i+" ");
        }
    }
}
