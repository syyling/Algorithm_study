package chap7;


/*
노드 클래스 생성
 */
class Node {
    int data;
    Node lt, rt; //객체 주소 저장

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class Chap7_05 {

    Node root;
    public void DFS(Node root) {
       if(root==null) return;
       else {
           DFS(root.lt);
           DFS(root.rt);
           System.out.print(root.data + " "); //후위순회
       }
    }

    public static void main(String[] args) {
        Chap7_05 tree = new Chap7_05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
