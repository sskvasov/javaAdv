package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class IntegerCollectionManager2 {
    public List<Integer> transform(List<Integer> data, Function<Integer, Integer> action) {
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            result.add(action.apply(x));
        }
        return result;
    }

        public void doIt(List<Integer>data, Consumer action){
        for (int x : data) {
            action.accept(x);
        }
    }

    public List<Integer> filter(List<Integer> data, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            if (predicate.test(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
