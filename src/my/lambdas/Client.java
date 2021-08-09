package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.stream().filter(x -> x % 2 == 1).collect(Collectors.toList()).forEach(System.out::println);
//        for (int x:results){
//            System.out.println(x);
//        }
//results.forEach(System.out::println);
    }


    public static void main1(String[] args) {
        System.out.println("Hello, World!");
        IntegerCollectionManager integerCollectionManager = new IntegerCollectionManager();
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
//        List<Integer> results = integerCollectionManager.squares(data);
//        for (int x : results) {
//            System.out.println(x);
//        }

        //Передача действия в стиле ООП
        IntegerCollectionManager1 integerCollectionManager1 = new IntegerCollectionManager1();
//        List<Integer> results = integerCollectionManager1.transform(data, new TransformInteger() {
//            @Override
//            public Integer doTransform(Integer x) {
//                return x * x;
//            }
//        });

        //Передача действия в функциональном стиле (лямбда стиль)
//        List<Integer> results = integerCollectionManager1.transform(data, x -> {
//            return x * x * x;
//        });
        //Сокращенный эквивалент предыдущей строки
//        List<Integer> results = integerCollectionManager1.transform(data, x -> x * x * x);
//        for (int x : results) {
//            System.out.println(x);
//        }

//        integerCollectionManager1.transform(data, x ->{
//            System.out.println(x*x);
//            return x;
//        });

        IntegerCollectionManager2 integerCollectionManager2 = new IntegerCollectionManager2();

//        integerCollectionManager2.transform(data, x ->{
//            System.out.println(x*x);
//            return x;
//        });

        List<Integer> results = integerCollectionManager2.filter(data, x -> x % 2 == 0);
//        for (int x : results) {
//            System.out.println(x);
//        }
        integerCollectionManager2.doIt(results, x -> {
            System.out.println(x);
        });
    }
}
