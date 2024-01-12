package chap7;

import java.util.LinkedList;
import java.util.Queue;

public class Chap7_10 {

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node node = Q.poll();
                if(node.lt==null && node.rt==null) return L;
                if(node.lt!=null) Q.offer(node.lt);
                if(node.rt!=null) Q.offer(node.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Chap7_10 T = new Chap7_10();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.BFS(root));
    }
}
