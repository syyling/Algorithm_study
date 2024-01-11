package chap7;

public class Chap7_06 {

    static int n;
    static int[] ch; //사용여부 체크배열

    public void DFS(int L) { //L:레벨 값
        if(L==n+1) {
            for(int i=1; i<=n; i++) if(ch[i]==1)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            ch[L]=1; //왼쪽은 사용
            DFS(L+1); //왼쪽
            ch[L]=0; //오른쪽은 사용X
            DFS(L+1); //오른쪽
        }
    }

    public static void main(String[] args) {
        Chap7_06 T = new Chap7_06();
        n=3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
