package chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
    public int height;
    public int weight;

    Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p) {
        return p.height-this.height;
    }
}

class Chap9_01 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Person[] arr = new Person[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Person(kb.nextInt(), kb.nextInt());
        }
        Arrays.sort(arr);
        int answer=0;
        int max = Integer.MIN_VALUE;
        for(Person p : arr) {
            if(max<p.weight) {
                max = p.weight;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
