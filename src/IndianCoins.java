import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndianCoins {

    public static void minChange(int amount) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < coins.length; i++){
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("Min no of changes is: " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        minChange(1059);
    }
}
