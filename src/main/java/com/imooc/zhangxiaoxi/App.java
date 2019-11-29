package com.imooc.zhangxiaoxi;

import java.util.*;

/**
 * @author:Sea
 *
 */
public class App 
{
    public static void main( String[] args )
    {

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
