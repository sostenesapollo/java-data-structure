//package misc.big_o;/**/

public class Main {
    public static void main(String[] args) {
        printItems(14);
    }

    public static int addItems(int n) {
        // O(1) => Constant time (as n grows operations keep the same)
        return n+n;
    }

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
}