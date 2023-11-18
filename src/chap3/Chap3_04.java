package chap3;

import java.util.Scanner;

public class Chap3_04 {

    /*
    public int solution(int n, int m, int[] a) {
        int answer = 0, sum = 0;
        int p1=0, p2=0;
        while(p1<n && p2<n) {
            sum += a[p2++];
            if(sum == m) {
                answer++;
                sum=0;
                p1++;
                p2=p1;
            }
            else if(sum>m) {
                sum=0;
                p1++;
                p2=p1;
            }
        }
        return answer;
    }
    */

    public int solution(int n, int m, int[] a) {
        int answer=0, sum=0;
        int lt=0;
        for(int rt=0; rt<n; rt++) { //증가하고 더하고 확인
            sum+=a[rt];
            if(sum==m) answer++;
            while(sum>=m) {
                sum-=a[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap3_04 T = new Chap3_04();
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
