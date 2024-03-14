package chap9;

import java.util.*;

class Meeting implements Comparable<Meeting>{
    public int start;
    public int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting m) {
        if(this.end==m.end) return this.start-m.start;
        else return this.end-m.end;
    }
}

public class Chap9_02 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Meeting[] arr = new Meeting[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Meeting(kb.nextInt(), kb.nextInt());
        }
        Arrays.sort(arr);
        int time = arr[0].end;
        int answer = 1;
        for(int i=1;i<n; i++) {
            if(time<=arr[i].start) {
                time = arr[i].end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
