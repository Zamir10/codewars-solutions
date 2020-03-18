import java.util.HashMap;

public class FindOdd {
  public static int findIt(int[] arr) {
    HashMap<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (l.containsKey(arr[i])) {
                l.put(arr[i], l.get(arr[i]) + 1);
            } else {
                l.put(arr[i], 1);
            }
        }

        for (Integer a: l.keySet()) {
            if (l.get(a) % 2 != 0) {
                return a;
            }
        }

        return 0;
  }
}
