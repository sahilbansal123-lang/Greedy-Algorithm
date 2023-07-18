public class BalancedSubstring {

    public static void balancedSubstring(String str) {
        if (str.length() == 0) {
            return;
        }
        int l = 0, r = 0;
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (l == r) {
                res++;
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        balancedSubstring(str);
    }
}
