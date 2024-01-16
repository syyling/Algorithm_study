package chap8;


import java.util.Scanner;

public class Chap8_01 {

    static String answer = "NO";
    static int sum=0;
    static int total=0;
    static int n;
    static int[] arr;
    static int[] ch;

    public String DFS(int v) {
        if(v==n) {
            for(int i=0; i<v; i++) {
                if(ch[i]==1) sum += arr[i];
            }
            if((total-sum)==sum) answer = "YES";
            sum=0;
        }
        else{
            ch[v]=1;
            DFS(v+1);
            ch[v]=0;
            DFS(v+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap8_01 T = new Chap8_01();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        ch = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=kb.nextInt();
            total += arr[i];
        }
        System.out.println(T.DFS(0));
    }
}
