package chap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chap3_01 {

    public ArrayList<Integer> solution(int a, int b, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<a && p2<b) {
            if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]); //추가하고 증가
            else answer.add(arr2[p2++]);
        }
        while(p1<a) answer.add(arr1[p1++]);
        while(p2<b) answer.add(arr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Chap3_01 T = new Chap3_01();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] arr1 = new int[a];
        for(int i=0; i<a; i++) {
            arr1[i] = kb.nextInt();
        }
        int b = kb.nextInt();
        int[] arr2 = new int[b];
        for(int j=0; j<b; j++) {
            arr2[j] = kb.nextInt();
        }
        for(int x: T.solution(a, b, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
