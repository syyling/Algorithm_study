package chap7;

import backjoon.Main;

public class Chap7_09 {

    public int DFS(int L, Node root) {
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Chap7_09 T = new Chap7_09();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, root));
    }
}
