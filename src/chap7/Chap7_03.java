package chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Chap7_03 {

    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) throws IOException {
        Chap7_03 T = new Chap7_03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.DFS(n));
    }
}
