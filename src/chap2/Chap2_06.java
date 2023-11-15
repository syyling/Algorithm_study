package chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap2_06 {

    public boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2; i<num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    /* 숫자 뒤집을때 string 메서드 사용
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int x: arr) {
            String s = new StringBuilder(String.valueOf(x)).reverse().toString();
            int num = Integer.parseInt(s);
            if(isPrime(num)) answer.add(num);
        }
        return answer;
    }
    */

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp>0) {
                int t = tmp%10;
                res = 10*res + t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_06 T = new Chap2_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
