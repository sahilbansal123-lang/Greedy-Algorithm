import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {

    public static void maxLengthChain(int pair[][]) {
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int pairEnd = pair[0][1]; // it starts with the first vale of y coordinate

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > pairEnd) {
                chainLength++;
                pairEnd = pair[i][1];
            }
        }
        System.out.println("Max Length of Pair Chain is: " + chainLength);
    }

    public static void main(String[] args) {
        int pair[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        maxLengthChain(pair);
    }
}
