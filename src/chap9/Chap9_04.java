package chap9;

import java.util.*;

class Lecture implements Comparable<Lecture> {

    public int money;
    public int day;

    Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture l) {
        return l.day-this.day;
    }
}


public class Chap9_04 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            arr.add(new Lecture(kb.nextInt(), kb.nextInt()));
        }

        Collections.sort(arr);
        int max = arr.get(0).day;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j=0; int answer=0;
        for(int i=max; i>0; i--) {
            for( ; j<n; j++) {
                if(arr.get(j).day<i) break;
                else pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        System.out.println(answer);
    }
}