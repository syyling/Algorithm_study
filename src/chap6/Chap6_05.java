package chap6;

import java.util.Arrays;
import java.util.Scanner;


//hashmap으로 풀면 O(n)
//정렬로 풀면 O(nlogn)
public class Chap6_05 {

    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr); //배열 정렬
        for(int i=0; i<n-1; i++) {
            if(arr[i]==arr[i+1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap6_05 T = new Chap6_05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
