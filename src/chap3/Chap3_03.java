package chap3;

import java.util.Scanner;

public class Chap3_03 {

    /*시간초과(이중for문)
    public int solution(int n, int m, int[] a) {
        int answer = 0;
        int p = n-m+1;
        for(int i=0; i<p; i++) {
            int tmp=0;
            for(int j=0; j<m; j++) tmp+=a[i+j];
            if(answer<tmp) answer = tmp;
        }
        return answer;
    }
     */

    public int solution(int n, int m, int[] a) {
        int answer = 0, tmp = 0;
        for(int i=0; i<m; i++) {
            tmp += a[i];
        }
        answer = tmp;
        for(int i=0; i<n-m; i++) {
            tmp = tmp - a[i] + a[m+i];
            if(answer<tmp) answer = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap3_03 T = new Chap3_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,a));
    }
}
