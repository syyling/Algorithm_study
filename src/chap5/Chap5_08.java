package chap5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;;

    public Person(int id, int priority) {
        this.id=id;
        this.priority=priority;
    }
}

public class Chap5_08 {

    public int solution(int n, int m, int[] arr) {
        int answer=0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<n; i++) Q.offer(new Person(i, arr[i]));
        while(!Q.isEmpty()) {
            Person p = Q.poll();
            for(Person x : Q) {
                if(x.priority>p.priority) {
                    Q.offer(p);
                    p=null;
                    break;
                }
            }
            if(p!=null) {
                answer++;
                if(p.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap5_08 T = new Chap5_08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
