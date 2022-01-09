import java.util.ArrayList;
import java.util.List;

public class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>(n);
        for(int i = 0; i< n ; i++){
            friends.add(i+1);
        }
       return winnerFinder(friends, k, 0);
        
    }
    int winnerFinder(List<Integer> friends, int k, int s){
        if(friends.size() == 1){
            return friends.get(0);
        }else {
            s+= k-1;
            s%= friends.size();
            friends.remove(s);
           return winnerFinder(friends, k, s);
        }
    }  
}
