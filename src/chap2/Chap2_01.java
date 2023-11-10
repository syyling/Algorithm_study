package chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap2_01 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int x = arr[0];
        answer.add(x);
        for(int i=1; i<n; i++) {
            if(x<arr[i]) {
                answer.add(arr[i]);
            }
            x = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_01 T = new Chap2_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //배열 생성
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
