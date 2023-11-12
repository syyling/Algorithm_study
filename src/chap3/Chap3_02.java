package chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chap3_02 {

    public ArrayList<Integer> solution(int a, int b, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1); //오름차순 정렬
        Arrays.sort(arr2);
        int p1=0, p2=0;
        /* 시간 초과
        while(p1<a) {
            while(p2<b) {
                if(arr1[p1]==arr2[p2]) {
                    answer.add(arr1[p1]);
                    break;
                }
                else p2++;
            }
            p1++;
            p2=0;
        }
        */
        while(p1<a && p2<b) {
            if(arr1[p1]==arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1]<arr2[p2]) p1++;
            else p2++;

        }
        return answer;
    }

    public static void main(String[] args) {
        Chap3_02 T = new Chap3_02();
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
