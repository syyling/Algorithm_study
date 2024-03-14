package chap9;

import java.util.*;

class Time implements Comparable<Time> {
    public int time;
    public char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time t) {
        if(this.time==t.time) return this.state-t.state;
        else return this.time-t.time;
    }

}

public class Chap9_03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Time[] arr = new Time[n*2];
        for(int i=0; i<n*2; i=i+2) {
            arr[i] = new Time(kb.nextInt(), 's');
            arr[i+1] = new Time(kb.nextInt(), 'e');
        }
        Arrays.sort(arr);
        int cnt = 0; int max = Integer.MIN_VALUE;
        for(int i=0; i<2*n; i++) {
            if(arr[i].state=='s') {
                cnt++;
                if(max<cnt) {
                    max = cnt;
                }
            }
            else cnt--;
        }
        System.out.println(max);
    }
}
