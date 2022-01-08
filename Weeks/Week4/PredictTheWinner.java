public class PredictTheWinner {
    public boolean predictTheWinner(int[] nums) {
        
        int[] answer = playGame(nums, 0, nums.length - 1, 0);
        if(answer[0]>= answer[1]){
            return true;
        }else return false;
        
    }
    
    public int[] playGame(int[] arr, int l, int r, int turn){
        if(l == r){
            int[] score = new int[2];
            score[turn] = arr[l];
            return score;
        }
        int nextTurn = turn == 0? 1:0;
        int[] scoreLeft = playGame(arr, l+1, r, nextTurn);
        int[] scoreRight = playGame(arr, l, r-1, nextTurn);
        
        scoreLeft[turn]+= arr[l];
        scoreRight[turn]+= arr[r];
        
        if(scoreLeft[turn] > scoreRight[turn]){
            return scoreLeft;
        } else return scoreRight;
         
}}
