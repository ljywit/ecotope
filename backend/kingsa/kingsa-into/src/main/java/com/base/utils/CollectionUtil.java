package com.base.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 集合工具类.
 *
 */
public class CollectionUtil {
    /**
     * 对集合进行切分.
     *
     * <p>如待切分的list有如下元素：</p>
     * <pre>
     *     [1, 2, 3, 4, 5]
     * </pre>
     *
     * <p>每批大小2，则切分后的结果为：</p>
     * <pre>
     *     1-[1, 2]
     *     2-[3, 4]
     *     3-[5]
     * </pre>
     *
     * @param t 需要切分的集合
     * @param batchSize 每批大小
     * @param <T> 集合子类
     * @param <E> 集合中的数据类型
     * @return Map<batchNo, batch> 切分后的批号与每批的集合的关系
     */
    public static <T extends Collection<E>, E> Map<Integer, T> splitClct(T t, int batchSize) {
        Map<Integer, T> tMap = new HashMap();

        // 排除异常参数
        if (t == null || t.size() == 0 || batchSize <= 0) {
            throw new IllegalArgumentException("Illegal argument t: " + t + ", batchSize: " + batchSize + ".");
        }

        try {
            T tempT = null;
            int tSize = 0;
            int tBatch = 0;
            for (E e : t) {
                // tSize = 0时，需要新建批次
                if (tSize == 0) {
                    tSize = batchSize;
                    tBatch++;
                    tempT = (T) t.getClass().newInstance();
                    tMap.put(tBatch, tempT);
                }
                tSize--;

                tempT.add(e);
            }

            return tMap;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
