package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap7_04 {

    static int[] fibo;

    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n]; //메모이제이션 활용 - 성능 향상
        if(n==1||n==2) return fibo[n]=1;
        else {
            return fibo[n]=DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        Chap7_04 T = new Chap7_04();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n];
        T.DFS(n);
        for(int x:fibo) System.out.print(x + " ");
    }
}
