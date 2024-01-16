package chap8;


import java.util.Scanner;

public class Chap8_01 {

    static String answer = "NO";
    static int total=0;
    static int n;
    static int[] arr;
    boolean flag = false;

    public void DFS(int v, int sum) {
        if(flag) return;
        if(sum>total/2) return;
        if(v==n) {
            if((total-sum)==sum) {
                answer = "YES";
                flag = true;
            }
        }
        else{
            DFS(v+1, sum+arr[v]);
            DFS(v+1, sum);
        }
    }

    public static void main(String[] args) {
        Chap8_01 T = new Chap8_01();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
