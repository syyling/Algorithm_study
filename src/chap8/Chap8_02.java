package chap8;

import java.util.Scanner;

public class Chap8_02 {

    static int c, n;
    static int max=Integer.MIN_VALUE;
    static int[] arr;

    public void DFS(int L, int sum) {
        if(sum>c) return;
        if(L==n) {
            max=Math.max(max, sum);
        }
        else{
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        Chap8_02 T = new Chap8_02();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        T.DFS(0, 0);
        System.out.println(max);
;    }
}
