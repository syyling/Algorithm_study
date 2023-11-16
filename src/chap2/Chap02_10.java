package chap2;

import java.util.Scanner;

public class Chap02_10 {

    /* 대각선 방향도 확인해야할 경우 if문 8개는 비효율적
    배열 선언할때 +2 씩 해야함
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if((arr[i][j] > arr[i-1][j])&&(arr[i][j]>arr[i+1][j])
                &&(arr[i][j]>arr[i][j+1])&&(arr[i][j]>arr[i][j-1])) {
                    answer++;
                }
            }
        }
        return answer;
    }
    */

    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boolean flag = true;
                for(int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>0 && nx<n && ny>0 && ny<n && arr[nx][ny]<arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag==true) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap02_10 T = new Chap02_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
