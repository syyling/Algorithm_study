package chap10;

import java.util.Scanner;

public class Chap10_01 {

    static int[] dy;
    public int solution(int n) {
        dy = new int[n];
        dy[0]=1; dy[1]=2;
        for(int i=2; i<n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n-1];
    }

    public static void main(String[] args) {
        Chap10_01 T = new Chap10_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
