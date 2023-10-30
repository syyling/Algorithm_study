package chap1;

import java.util.Scanner;

public class Chap1_10 {

    public int[] solution(String str, char c) {
        int p = 1000;
        int[] arr = new int[str.length()];
        char[] charArray = str.toCharArray();

        for(int i=0; i<=str.length()-1; i++) {
            if(charArray[i]==c) {p=0;}
            else {p++;}
            arr[i] = p;
        }

        for(int i=str.length()-1; i>=0; i--) {
           if(charArray[i]==c) {p=0;}
           else {p++;}
           if(p<arr[i]) {arr[i] = p;}
        }

        return arr;
    }

    public static void main(String[] args) {
        Chap1_10 T = new Chap1_10();
        Scanner kb= new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x: T.solution(str, c)) {
            System.out.print(x+" ");
        }
    }
}
