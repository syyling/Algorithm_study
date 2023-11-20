package chap5;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_03 {

    public int solution(int n, int[][] board, int move, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<move; i++) {
            int x = moves[i];
            for(int j=0; j<n; j++) {
                if(board[j][x] != 0) {
                    if(stack.empty() || stack.peek()!=board[j][x]) {
                        stack.push(board[j][x]);
                    }
                    else {
                        answer+=2;
                        stack.pop();
                    }
                    board[j][x] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap5_03 T = new Chap5_03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n+1];
        for(int i=0; i<n; i++) {
            for(int j=1; j<=n; j++) board[i][j] = kb.nextInt();
        }
        int move = kb.nextInt();
        int[] moves = new int[move];
        for(int i=0; i<move; i++) {
            moves[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, board, move, moves));
    }
}
