package chap7;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap7_13 {

    static int n, m, answer=0;
    static int[] ch;

    //Integer를 저장하는 ArrayList를 저장하는 ArrayList
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int nv : graph.get(v)) {
                if(ch[nv]==0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Chap7_13 T = new Chap7_13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>(); //객체 생성
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>()); //객체 생성
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
