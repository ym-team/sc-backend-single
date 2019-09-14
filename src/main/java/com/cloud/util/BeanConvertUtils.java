package com.cloud.util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import com.cloud.user.model.AppUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean转换工具类
 *
 * @since 1.0.0
 * @author zhaohai.wu
 * @date 2015年9月22日 上午10:36:56
 * 
 */
public final class BeanConvertUtils {

    private BeanConvertUtils() {
        super();
    }


    /**
     * 转换bean
     * 
     * @param source
     *            源对象
     * @param targetClass
     *            目标对象类
     * @param handler
     *            对象转换处理器
     * @return 转换后的bean
     *
     * @since 1.0.0
     */
    public static <K, T> K convert(T source, Class<K> targetClass, BeanConvertHandler<T, K> handler) {
        K target = null;

        if (source != null) {
            try {
                // 初始化bean
                target = targetClass.newInstance();

                // 简单的直接拷贝
                BeanUtils.copyProperties(source, target);

                // 如果存在自定义处理器则这些
                if (handler != null) {
                    handler.handle(source, target);
                }
            } catch (BeansException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


        return target;
    }


    /**
     * 转换bean
     * 
     * @param source
     *            源对象
     * @param targetClass
     *            目标对象类
     * @return 转换后的bean
     *
     * @since 1.0.0
     */
    public static <K, T> K convert(T source, Class<K> targetClass) {
        return convert(source, targetClass, null);
    }


    /**
     * 转换bean列表
     * 
     * @param sources
     *            源对象列表
     * @param targetClass
     *            目标对象类
     * @param handler
     *            转换处理对象
     * @return 转换厚的的targetClass 对应 bean列表
     * 
     * @since 1.0.0
     */
    public static <K, T> List<K> convertList(List<T> sources, Class<K> targetClass, BeanConvertHandler<T, K> handler) {
        List<K> targets = null;

        if (sources != null) {
            targets = new ArrayList<>(sources.size());

            // 循环转换
            K target;
            for (T source : sources) {
                target = convert(source, targetClass, handler);
                if (target != null) {
                    targets.add(target);
                }
            }
        }

        return targets;
    }


    /**
     * 转换bean列表
     * 
     * @param sources
     *            源对象列表
     * @param targetClass
     *            目标对象类
     * @return 转换厚的的targetClass 对应 bean列表
     * 
     * @since 1.0.0
     */
    public static <K, T> List<K> convertList(List<T> sources, Class<K> targetClass) {
        return convertList(sources, targetClass, null);
    }
  
}
