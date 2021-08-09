package my.lambdas;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollectionManager1 {
    public List<Integer> transform(List<Integer>data, TransformInteger action){
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            result.add(action.doTransform(x));
        }
        return result;
    }
}
