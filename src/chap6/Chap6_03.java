package chap6;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Chap6_03 {

    public int[] solution(int n, int[] arr) {
        for(int i=1; i<n; i++) {
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(tmp<arr[j]) {
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Chap6_03 T = new Chap6_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        for(int x: T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
