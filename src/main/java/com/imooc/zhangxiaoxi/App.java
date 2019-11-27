package com.imooc.zhangxiaoxi;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        List<String> nameList =new ArrayList<>();
//        nameList.add("Google");
//        nameList.add("W3CSchool");
//        nameList.add("Taobao");
//        nameList.add("Baidu");
//        nameList.add("Sina");
//        List<String> nameList1 = nameList;
//
//        System.out.println("原始数据----");
//        nameList.forEach(System.out::println);
//        System.out.println("Java7----");
//        App app = new App();
//        app.sortJava7(nameList);
//        nameList.forEach(System.out::println);
//        System.out.println("Java8----");
//        app.sortJava8(nameList1);
//        nameList1.forEach(System.out::println);
//
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        int sum = numbers.stream()
//                .filter(n -> n % 2 == 1)
//                .map(n -> n * n)
//                .reduce(Integer::sum)
//                .get();
//        System.out.println(sum);
//
//        Stream<String> stream = Stream.of("123456","789");
//        stream.forEach(System.out::println);


        List<Integer> numberStream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numberStream.stream()
                .forEach(System.out::println);

        List<Integer> numberParallelStream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numberParallelStream.parallelStream()
                .forEach(System.out::println);

    }

    private void sortJava7(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
    }

    private void sortJava8(List<String> list){
        list.sort(Comparator.naturalOrder());
    }
}
