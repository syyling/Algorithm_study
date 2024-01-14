package chap7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chap7_14 {

    static int n, m;
    static int[][] graph;

    public int BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(1);
        int L=0;  //레벨로 풀었음
        while(!Q.isEmpty()) {
            int size = Q.size();
            for(int i=0; i<size; i++) {
                int nv = Q.poll();
                if(nv==v) return L;
                for(int j=1; j<=n; j++) {
                    if(graph[nv][j]==1) Q.offer(j);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Chap7_14 T = new Chap7_14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        for(int i=2; i<=n; i++) {
            System.out.println(i + " : " + T.BFS(i));
        }
    }
}
