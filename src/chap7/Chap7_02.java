package chap7;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Chap7_02 {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Chap7_02 T = new Chap7_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
