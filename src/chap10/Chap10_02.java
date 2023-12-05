package chap10;

import java.util.Scanner;

public class Chap10_02 {

    static int[] dy;

    public int solution(int n) {
        dy = new int[n+2];
        dy[1]=1; dy[2]=2;
        for(int i=3; i<n+2; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        Chap10_02 T = new Chap10_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
