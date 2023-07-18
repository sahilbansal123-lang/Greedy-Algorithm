import  java.util.*;

public class ChocolaProblem {

    public static void minCost(Integer[] horizontalCost, Integer[] verticalCost){
        Arrays.sort(horizontalCost, Collections.reverseOrder());
        Arrays.sort(verticalCost, Collections.reverseOrder());

        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int cost = 0;

        while (v < verticalCost.length && h < horizontalCost.length){
            if (horizontalCost[h] >= verticalCost[v]) {
                cost += (horizontalCost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (verticalCost[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < horizontalCost.length){
            cost += (horizontalCost[h] * vp);
            hp++;
            h++;
        }
        while (v < verticalCost.length){
            cost += (verticalCost[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Cost of cutting each Pair of chocolate is: " + cost);
    }

    public static void main(String[] args) {

        Integer[] verticalCost = {2, 1, 3, 1, 4};
        Integer[] horizontalCost = {4, 1, 2};

        minCost(horizontalCost, verticalCost);
    }
}
