package chap8;

import java.util.Scanner;

public class Chap8_03 {

    static int n,m;
    static int max=Integer.MIN_VALUE;
    static int[][] arr;

    public void DFS(int L, int time, int sum) {
        if(time>m) return;
        if(L==n) {
            max=Math.max(max, sum);
        }
        else{
            DFS(L+1, time+arr[L][1], sum+arr[L][0]);
            DFS(L+1, time, sum);
        }
    }

    public static void main(String[] args) {
        Chap8_03 T = new Chap8_03();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n][2];
        for(int i=0; i<n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(max);
    }
}