public class BigO {

    public static void printItems(int n) {
        // O(nˆ2 + n) => O(nˆ2) => Drop dominant
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    public static int addItems(int n) {
        // O(1) => Constant time (as n grows operations keep the same)
        return n+n+n;
    }

    public static void printItemsWithTwoArgs(int a, int b) {
        // O(a) + O(b) = O ( a + b ) <= As far as we can simplify this

        // Because for i.e : O(1000000 + 1) it would consume a lot more of time

        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }
    }

    public static void printItemsWithTwoArgsMultiply(int a, int b) {
        // O(a*b)
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i+" "+j);
            }
        }
    }
}
