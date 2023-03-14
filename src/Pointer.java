import java.util.HashMap;

public class Pointer {
    public static void Example() {

        int num1 = 11;
        int num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

    }

    public static void HashMapPointer() {
        //

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        map3 = map2;

        System.out.println(map1);
        System.out.println(map3);
    }

}
