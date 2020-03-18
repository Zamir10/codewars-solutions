import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {
    
    public static List<Integer> sumConsecutives(List<Integer> numbers) {
       List<Integer> consecutive = new ArrayList<>();
        int flag = numbers.get(0);
        consecutive.add(flag);
        int pos = consecutive.indexOf(flag);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) != flag) {
                flag = numbers.get(i);
                consecutive.add(flag);
                pos = consecutive.indexOf(flag);
            } else {
                consecutive.set(pos, consecutive.get(pos) + numbers.get(i));
            }
        }

        return consecutive;
    }

}
