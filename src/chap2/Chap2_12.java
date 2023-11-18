package chap2;

import java.util.Scanner;

public class Chap2_12 {

    public int solution(int s, int n, int[][] arr) {
        int answer = 0;
        int[][] rank = new int[n][s];
        for(int i=0; i<n; i++) {
            for(int j=0; j<s; j++) {
                rank[i][arr[i][j]-1] = j+1;
            }
        }
        for(int i=0; i<s-1; i++) {
            for(int j=i+1; j<s; j++) {
                boolean flag = true;
                for(int k=1; k<n; k++) {
                    if((rank[k][i]<rank[k][j])!=(rank[0][i]<rank[0][j])) {
                        flag = false;
                    }
                }
                if(flag == true) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_12 T = new Chap2_12();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[][] arr = new int[n][s];
        for(int i=0; i<n; i++) {
            for(int j=0; j<s; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(s, n, arr));
    }
}
