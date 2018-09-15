package utils;

import java.util.List;

/**
 * Created by lxf on 18/9/13.
 */
public class IntervalUtil {
    /**
     * @Title:intervalReclosing
     * @Description:判断区间是否重合
     * @Param @param i1
     * @Param @param i2
     * @Param @return
     * @Return boolean
     * @Throws
     */
    public static boolean intervalReclosing(Interval i1, Interval i2) {
        boolean leftReclosing = !(i1.getLl_soc() == 1 && i2.getUl_soc() == 1);
        boolean rightReclosing = !(i1.getUl_soc() == 1 && i2.getLl_soc() == 1);
        if (i1.getLl() > i2.getUl()) {
            return false;
        }
        if (i1.getLl() == i2.getUl() && leftReclosing) {
            return false;
        }
        if (i2.getLl() > i1.getUl()) {
            return false;
        }
        if (i2.getLl() == i1.getUl() && rightReclosing) {
            return false;
        }
        return true;
    }

    /**
     * @Title:intervalReclosing
     * @Description:检查线性排列的区间是否有重叠
     * @Param @param intervals
     * @Param @return
     * @Return boolean
     * @Throws
     */
    public static boolean intervalReclosing(List<Interval> intervals) {
        int size = intervals.size();
        if (size < 2) {
            return false;
        }
        boolean reclosing = false;
        for (int i = 1; i < size; i++) {
            Interval pre = intervals.get(i - 1);
            Interval sub = intervals.get(i);
            if (pre.getLl() < sub.getUl()) {
                reclosing = true;
                break;
            }
            if (pre.getLl() == sub.getUl()) {
                if (pre.getLl_soc() == 1 && sub.getUl_soc() == 1) {
                    reclosing = true;
                    break;
                }
            }
            if (intervalReclosing(pre, sub)) {
                reclosing = true;
                break;
            }
        }
        return reclosing;
    }

    /**
     * @Title:intervalContainsValue
     * @Description:判断值是否在区间里
     * @Param @param interval
     * @Param @param value
     * @Param @return
     * @Return boolean
     * @Throws
     */
    public static boolean intervalContainsValue(Interval interval, double value) {
        if (interval.getLl() < value && interval.getUl() > value) {
            return true;
        }
        if (interval.getLl() == value && interval.getLl_soc() == 1) {
            return true;
        }
        if (interval.getUl() == value && interval.getUl_soc() == 1) {
            return true;
        }
        return false;
    }
}
