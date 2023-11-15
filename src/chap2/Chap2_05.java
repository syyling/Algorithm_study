package chap2;

import java.util.Scanner;

public class Chap2_05 {

    /*
    public int solution(int n, int[] arr) {
        int answer = 0;
        int x = n/2;
        for(int i=2; i<=n; i++) {
            if(arr[i]==0) {
                for(int j=2; j<=x; j++) {
                    if(i*j<=20) arr[i*j] = 1;
            }
                answer++;
            }
        }
        return answer;
    }
    */

    /*
    에라토스테네스 체 -> 소수구하는 방법 중에 가장 빠름
    배열 0으로 초기화, 값이 0일때 배수 1로 체크 & 소수 +1
     */
    public int solution(int n, int[] arr) {
        int answer = 0;

        for(int i=2; i<=n; i++) {
            if(arr[i]==0) {
                for(int j=i; j<=n; j=j+i) { //i의 배수
                    arr[j] = 1;
                }
                answer++;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Chap2_05 T = new Chap2_05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];
        System.out.println(T.solution(n, arr));
    }
}
