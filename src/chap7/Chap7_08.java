package chap7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chap7_08 {

    static int[] arr = {1, -1, 5};
    Queue<Integer> Q = new LinkedList<>();
    int[] ch;

    public int BFS(int s, int e) {
        int L = 0;
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                int tmp = Q.poll();
                for(int x: arr) {
                    int nx = tmp + x;
                    if(nx==e) return L+1;
                    if(ch[nx]==0 && nx>=1 && nx<=10000) {
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Chap7_08 T = new Chap7_08();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s,e));
    }
}
