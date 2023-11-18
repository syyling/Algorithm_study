package chap2;

import java.util.Scanner;

public class Chap2_11 {

    /* 제일 처음 쓴 답
    public int solution(int n, int[][] arr) {
        int answer = 0, max=0;
        for(int num=1; num<=n; num++) {
            int cnt = 0;
            for(int g=1; g<=n; g++) { //g번학생
                for (int k=1; k<=5; k++) { //학년
                    if(arr[num][k]==arr[g][k]) { // num!=k는 필요 없음
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max) {
                answer = num;
                max = cnt;
            }
        }
        return answer;
    }
     */

    /* 오답
    4번과 5번이 4학년, 5학년 때 같은반이면
    4학년때만 카운팅되어야함(문제조건: 한번이라도 같은 반이었던 사람)
    학년 기준으로 돌면 4학년, 5학년 모두 카운팅되어서 오답

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;;
        for(int i=1; i<=n; i++) {
            int cnt = 0;
            for(int j=1; j<=5; j++) {
                for(int k=1; k<=n; k++) {
                    if(i!=k && arr[i][j]==arr[k][j]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
     */


    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;;
        for(int i=1; i<=n; i++) {
            int cnt = 0;
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k]==arr[j][k]) {
                        cnt++;
                        break; //문제조건: 한번이라도 같은 반
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Chap2_11 T = new Chap2_11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
