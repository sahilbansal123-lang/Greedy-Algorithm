import java.util.Arrays;

public class MinimumAbsoluteDiff {

    public static void absoluteDiff(int a[], int b[]) {

        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for (int i = 0; i < a.length; i++) {
            minDiff += a[i] - b[i];
        }

        System.out.println("Absolute Minimum Difference is: " + minDiff);
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 6, 1};
        int b[] = {6, 2, 1, 3};

        absoluteDiff(a, b);
    }
}
