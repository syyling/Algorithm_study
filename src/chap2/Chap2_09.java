package chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap2_09 {

    /*
    public int solution(int n, int[][] arr) {
        int answer = 0;
        ArrayList<Integer> max = new ArrayList<>();
        int c = 0;
        for(int i=0; i<n; i++) {
            int a = 0, b = 0, d = 0; //a:행의 합 b:열의 합
            for(int j=0; j<n; j++) {
                a += arr[i][j];
                b += arr[j][i];
                if(i+j+1 == n) d += arr[i][j];
            }
            c += arr[i][i];
            max.add(a);
            max.add(b);
            max.add(d);
        }
        max.add(c);
        answer = max.get(0);
        for(int x: max) {
            if(answer<x) answer=x;
        }
        return answer;
    }
    */

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Chap2_09 T = new Chap2_09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
