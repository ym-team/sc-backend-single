package com.cloud.util;


/**
 * 转换Bean处理器
 *
 * @since 1.0.0
 * @author zhaohai.wu
 * @date 2015年9月23日 下午3:40:03
 * 
 */
public interface BeanConvertHandler<T, K> {

    /**
     * bean转换操作（对需要特别处理的属性进行处理）
     * 
     * @param source
     *            源bean
     * @param target
     *            目标bean
     *
     * @since 1.0.0
     */
    void handle(T source, K target);
}
