import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

    public static void fractionalKnapsack(int[] val, int[] weight, int knapWeight) {
        double[][] ratio = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;
        int capacity = knapWeight;
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) { //whole weight
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.println("Final Value = " + finalVal);
    }

    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] val = {60, 100, 120};
        int knapSack = 50;

        fractionalKnapsack(val, weight, knapSack);
    }
}
