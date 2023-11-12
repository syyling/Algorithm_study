package chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap2_03 {

    public ArrayList<String> solution(int n, int[] arrA, int[] arrB) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arrA[i]==arrB[i]) answer.add("D");
            else if(arrA[i] == 2 && arrB[i] == 1) answer.add("A");
            else if(arrA[i] == 1 && arrB[i] == 3) answer.add("A");
            else if(arrA[i] == 3 && arrB[i] == 2) answer.add("A");
            else answer.add("B");
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap2_03 T = new Chap2_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        for(int i=0; i<n; i++){
            arrA[i] = kb.nextInt();
        }
        int[] arrB = new int[n];
        for(int i=0; i<n; i++){
            arrB[i] = kb.nextInt();
        }
        for(String s: T.solution(n, arrA, arrB)){
            System.out.println(s);
        }
    }
}
