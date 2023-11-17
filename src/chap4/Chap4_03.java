package chap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Chap4_03 {

    public ArrayList<Integer> solution(int n, int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        answer.add(map.size());
        for(int i=0; i<n-m; i++) {
            if(map.get(arr[i])>1) map.put(arr[i], map.get(arr[i])-1);
            else map.remove(arr[i]);
            if(map.containsKey(arr[m+i])) map.put(arr[m+i], map.get(arr[m+i])+1);
            else map.put(arr[m+i], 1);
            answer.add(map.size());
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap4_03 T= new Chap4_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n, m, arr)) {
            System.out.print(x + " ");
        }
    }
}
