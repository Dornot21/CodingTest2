package test1;

import java.util.Stack;

public class Lesson1 {
    public static void main(String[] args) {

        int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int move[] = {1,5,3,5,1,2,1,4};

        int result = solution(board, move);
        System.out.println(result);
    }

    public static int solution(int[][] boards, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int remove_doll = 0;

        for(int i=0; i<moves.length; i++){
            int move = moves[i] - 1;            //Target

            for(int j=0; j<boards[move].length; j++){
                int item = boards[j][move];
                if(item == 0){
                    continue;
                }else{
                    boards[j][move] = 0;
                    if(stack.empty()){
                        stack.push(item);
                    }else{
                        if(item == stack.peek()){
                            stack.pop();
                            remove_doll = remove_doll + 2;
                        }else{
                            stack.push(item);
                        }
                    }
                    break;
                }
            }
         }
        return remove_doll;
    }

    public static void printData(int[] data){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]);
        }
        System.out.println("");
        System.out.println("***************************");
    }
}
