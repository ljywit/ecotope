package com.rdc.kingsa.utils;

/**
 * Created by lxf on 18/9/13.
 */
public class Interval {
    private double ul, ll;
    private int ul_soc, ll_soc;

    public Interval(double ul, int ul_soc, double ll, int ll_soc) throws Exception {
        if (ul < ll) {
            throw new Exception("区间上限不能小于下限");
        }
        boolean opening = ul_soc == 0 && ll_soc == 0;
        if (ul == ll && opening) {
            throw new Exception("无效的区间");
        }
        this.ul = ul;
        this.ul_soc = ul_soc;
        this.ll = ll;
        this.ll_soc = ll_soc;
    }

    public double getUl() {
        return ul;
    }

    public void setUl(double ul) {
        this.ul = ul;
    }

    public double getLl() {
        return ll;
    }

    public void setLl(double ll) {
        this.ll = ll;
    }

    public int getUl_soc() {
        return ul_soc;
    }

    public void setUl_soc(int ul_soc) {
        this.ul_soc = ul_soc;
    }

    public int getLl_soc() {
        return ll_soc;
    }

    public void setLl_soc(int ll_soc) {
        this.ll_soc = ll_soc;
    }
}
