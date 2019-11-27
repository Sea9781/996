package com.imooc.zhangxiaoxi.stream;

import com.alibaba.fastjson.JSON;
import com.imooc.zhangxiaoxi.lambda.cart.CartService;
import com.imooc.zhangxiaoxi.lambda.cart.Sku;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: 996
 * @description:
 * @author: Sea
 * @create: 2019-11-17 18:18
 **/
public class StreamOperatorSea {
    private List<Sku> list;

    @Before
    public void  init(){
        list = CartService.getCartSkuList();
    }

    /**
     * filter
     */
    @Test
    public void filterTest(){
        list.stream().filter(sku ->
                sku.getSkuPrice()>600 )
                .forEach(e-> System.out.println(
                        JSON.toJSONString(e, true)
                ));
    }

    @Test
    public void mapTest(){
        list.stream()
                .map(sku -> sku.getSkuCategory())
                //去重操作
                .distinct()
                .forEach(e-> System.out.println(
                        JSON.toJSONString(e,true)));
    }

    @Test
    public void flatMapTest(){
        list.stream()
                .flatMap(sku ->
                        Arrays.stream(sku.getSkuName().split("")))
                .forEach(e ->
                        System.out.println(JSON.toJSONString(e,true)));
    }
}
