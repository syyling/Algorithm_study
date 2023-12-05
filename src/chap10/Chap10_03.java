package chap10;

import java.util.Arrays;
import java.util.Scanner;

public class Chap10_03 {

    static int[] dy;  //dy[i]: i번째 항을 마지막으로 하는 최대부분증가수열

    public int solution(int n, int[] arr) {
        dy = new int[n];
        dy[0]=1;
        for(int i=1; i<n; i++) {
            int max=1;
            for(int j=0; j<i; j++) {
                if(arr[j]<arr[i] && max<(dy[j]+1))
                    max = dy[j]+1;
            }
            dy[i] = max;
        }
        Arrays.sort(dy);
        return dy[n-1];
    }

    public static void main(String[] args) {
        Chap10_03 T = new Chap10_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
