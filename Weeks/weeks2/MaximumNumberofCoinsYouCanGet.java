import java.util.Arrays;

public class MaximumNumberofCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int coins = 0;
        for (int i = 0; i < piles.length - 2; i += 3) {
            coins = piles[i];
        }
        return coins;
    }
}
