package com.imooc.zhangxiaoxi.stream;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流的四种构建形式
 */
public class StreamConstructor {

    /**
     * 由数值直接构建流
     */
    @Test
    public void streamFromValue() {
        Stream stream = Stream.of(1, 2, 3, 4, 5);

        stream.forEach(System.out::println);
    }

    /**
     * 通过数组构建流
     */
    @Test
    public void streamFromArray() {
        int[] numbers = {1, 2, 3, 4, 5};

        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::println);
    }

    /**
     * 通过文件生成流
     *
     * @throws IOException
     */
    @Test
    public void streamFromFile() throws IOException {

        String filePath = "D:\\java test\\996\\src\\test\\java\\com\\imooc\\zhangxiaoxi\\AppTest.java";

        Stream<String> stream = Files.lines(
                Paths.get(filePath));

        stream.forEach(System.out::println);
    }

    /**
     * 通过函数生成流（无限流）
     */
    @Test
    public void streamFromFunction() {

//        Stream stream = Stream.iterate(0, n -> n + 2);

        Stream stream = Stream.generate(Math::random);

        stream.limit(3)
                .forEach(System.out::println);

        System.out.println("--------");

        Stream.iterate(2, n -> n + 2)
                .limit(3)
                .forEach(System.out::println);

        IntStream.generate(() -> 1)
                .limit(5)
                .forEach(System.out::println);

    }

}
