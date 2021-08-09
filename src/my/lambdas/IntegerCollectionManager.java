package my.lambdas;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollectionManager {
    public List<Integer> squares(List<Integer> data) {
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            result.add(x * x);
        }
        return result;
    }
}
