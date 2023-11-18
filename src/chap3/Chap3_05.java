package chap3;

import java.util.Scanner;

public class Chap3_05 {

    /*
    public int solution(int n) {
        int answer = 0;
        int p1=1, p2=1;
        int sum=0;
        while(p1<n && p2<n) {
            sum += p2++;
            if(sum<n) continue;
            else if(sum==n) {
                answer++;
                sum=0;
                p2 = ++p1;
            }
            else {
                sum=0;
                p2 = ++p1;
            }
        }
        return answer;
    }
     */

    public int solution(int n) {
        int answer = 0, sum=0, lt=1;
        for(int rt=1; rt<n; rt++) {
            sum += rt;
            if(sum==n) answer++;
            while(sum>=n) {
                sum -= lt;
                lt++;
                if(sum==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap3_05 T = new Chap3_05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
