package chap7;

import java.util.Scanner;

public class Chap7_12 {

    static int n;
    static int m;
    static int answer=0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int start) {
        if(start==5) {
            answer++;
            return;
        }
        for(int i=1; i<=n; i++) { //열
            if(graph[start][i]==1 && ch[i]==0) {
                ch[i]=1;
                DFS(i);
                ch[i]=0;
            }
        }
    }

    public static void main(String[] args) {
        Chap7_12 T = new Chap7_12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
