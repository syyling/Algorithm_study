package chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Chap5_06 {

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++) queue.offer(i+1);
        while(!queue.isEmpty()) {  //cnt 사용했더니 오답
            for(int i=1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size()==1) answer=queue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap5_06 T = new Chap5_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}