package chap6;

import java.util.Scanner;

public class Chap6_04 {

    public int[] solution(int size, int k, int[] arr) {
        int[] cache = new int[size];
        for(int x: arr) {
            int idx=-1;
            for(int i=0; i<size; i++) {
                if(cache[i] == x) idx = i;
            }
            if(idx==-1) { //cache miss
                for(int i=size-1; i>0; i--) {
                    cache[i] = cache[i-1];
                }
            }
            else { //cache hit
                for(int i=idx; i>0; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Chap6_04 T = new Chap6_04();
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k; i++) arr[i] = kb.nextInt();
        for(int x: T.solution(size, k, arr)) System.out.print(x + " ");
    }
}
