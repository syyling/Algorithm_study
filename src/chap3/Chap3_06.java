package chap3;

import java.util.Scanner;

public class Chap3_06 {

    public int solution(int n, int k, int[] a) {
        int answer = 0;
        int lt=0, cnt=0;
        for(int rt=0; rt<n; rt++) {
            if(a[rt]==0) cnt++;
            while(cnt>k) {
                if(a[rt]==0) cnt++;
                while(cnt>k) {
                    if(a[lt]==0) cnt--;
                    lt++;
                }
                answer=Math.max(answer, rt-lt+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap3_06 T = new Chap3_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,a));
    }
}
