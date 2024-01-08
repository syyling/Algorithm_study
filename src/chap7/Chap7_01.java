package chap7;

import java.util.Scanner;


//재귀함수: 백트래킹
//if else 구조로 짤 것!
public class Chap7_01 {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Chap7_01 T = new Chap7_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
