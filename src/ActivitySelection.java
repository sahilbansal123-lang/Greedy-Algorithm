import java.util.ArrayList;

public class ActivitySelection {

    // TIME COMPLEXITY = 0(N)
    // This is for Activities that are ending in sorted order given in the ques

    public static int activitySelection(int[] start, int[] end) {
        int maxAct = 1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                res.add(i);
                lastEnd = end[i];
            }
        }
        for (Integer re : res) {
            System.out.print("A" + re + " ");
        }
        System.out.println();
        return maxAct;
    }

    // If Activities are not ending in Sorted order. we have to sort them first
    // For sorting we use 2D matrix.

    public static void sorting(int start[], int end[]){
        int activities[][] = new int[start.length][3];

    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        System.out.println(activitySelection(start, end));
    }
}
