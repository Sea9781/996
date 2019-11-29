package com.imooc.zhangxiaoxi.lambda.cart;

/**
 * @author:Sea
 * Sku选择谓词接口
 */
public interface SkuPredicate {

    /**
     * 选择判断标准
     * @param sku
     * @return
     */
    boolean test(Sku sku);

}
