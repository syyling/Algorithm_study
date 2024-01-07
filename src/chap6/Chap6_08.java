package chap6;

import java.util.Arrays;
import java.util.Scanner;

public class Chap6_08 {

    public int solution(int n, int k, int[] arr) {
        int answer=0;
        int lt = 0, rt = n-1;
        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(arr[mid]==k) {
                answer = mid+1;
                break;
            }
            if(arr[mid]<k) lt = mid+1;
            else rt = mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap6_08 T = new Chap6_08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr); //이분탐색 - 정렬되어 있는 상태에서
        System.out.println(T.solution(n, k, arr));
    }
}
