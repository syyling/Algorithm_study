package chap6;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;


class Point implements Comparable<Point> {

    public int x, y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    /*
    this-매개변수 -> 오름차순 음수/내림차순 양수
     */
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Chap6_07 {

    public static void main(String[] args) {
        Chap6_07 T = new Chap6_07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Point[] arr = new Point[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Point(kb.nextInt(), kb.nextInt());
        }
        Arrays.sort(arr);
        for(Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
