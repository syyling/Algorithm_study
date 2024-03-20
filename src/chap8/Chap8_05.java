package chap8_review;

import java.util.*;

public class Chap8_05 {

    static int n;
    static Integer[] arr;
    int[] ch = new int[501];
    static int answer = Integer.MAX_VALUE;

    public void DFS(int m, int L) {
        if(m<0) return;
        if(L>=answer) return;
        if(m==0) {
            answer = Math.min(answer, L);
        }
        else{
            for(int x:arr) {
                if((m-x)>=0) {
                    DFS(m-x, L+1);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Chap8_05 T = new Chap8_05();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int m = kb.nextInt();
        T.DFS(m, 0);
        System.out.println(answer);
    }
}
