import java.util.ArrayList;

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

    public static void arrayList() {
        // Big O measures Worse case
        // Reindexing
        // O(1) <= Looking for a value by index don't require iterations array[index]
        // O(n) <= Looking for a item by its value requires iterations
        var array = new ArrayList<Number>();
        array.add(1);
        array.add(12);
        array.add(56);
        array.remove(0);
        System.out.println(array);

        // O(nˆ2) Loop within a Loop
        // O(n) Proportional =>  Straight line
        // O(log n) Divide and Conquer
        // O(1) Constant time
    }

    // Horrible to Excellent
    // O(n!)
    // O(2ˆn)
    // O(nˆ2)
    // O(n log n)
    // O(n)
    // O)log n), O(1)
}
