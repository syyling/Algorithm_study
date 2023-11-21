package chap4;

import java.util.*;

public class Chap4_05 {

    //TreeSet 이용 - 정렬, 중복제거, 검색에 유리
    public Integer solution(int n, int k, int[] arr){
        int answer = -1; //k번째 수가 존재하지 않으면 -1 출력
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int s=j+1; s<n; s++) {
                    Tset.add(arr[i] + arr[j] + arr[s]);
                }
            }
        }
        int cnt = 0;
        for(int x: Tset) {
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap4_05 T = new Chap4_05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k ,arr));
    }
}
