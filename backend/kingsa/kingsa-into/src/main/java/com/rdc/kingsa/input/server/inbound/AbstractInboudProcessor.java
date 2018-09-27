package com.rdc.kingsa.input.server.inbound;

import com.base.utils.ListUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractInboudProcessor<T> {

    protected List<T> lstJobs = new ArrayList<>();

    protected List<String> lstErrorMsg = new ArrayList<>();

    /**
     * excel中的记录是否从上往下读取
     * 水温是false，比较特列
     *
     * @return true 从上往下，false，从做往右
     */
    protected boolean isUpDown() {
        return true;
    }


    protected void handleSheet() {

        //解析xml文件，

        handleHeaderInfo();

        handleTitleInfo();
        if (isValid()) {
            handleBody();
        }
    }

    private boolean isValid() {
        return ListUtil.isEmpty(lstErrorMsg);
    }


    /**
     * 处理头信息
     */
    protected void handleHeaderInfo() {
        //暂时留空
    }

    private void handleTitleInfo() {
        //获取到列名称
        //excel的坐标
        //fieldName
        //名称与id的映射方法（断面等，可以通过cellHandler来实现）MAPPING, Type, CODE
        //字段类型
        //MAX,MIN
        //FORMAT
        //TOTDIGIT，FRACDIGIT
        //MANDATORY
        //
    }

    protected void handleBody() {
        //一行或一列读取，判断是否结束

        //previous current

        //是否跳过该行

        //获取当行数据，


    }

    /**
     * sheet名称
     *
     * @return String
     */
    protected abstract String getSheetName();

    /**
     * 获取表头的行数
     *
     * @return
     */
    protected abstract int getHeaderRowNum();

    /**
     * 获取表头的行数
     *
     * @return
     */
    protected int getHeaderColNum() {
        return 0;
    }

    /**
     * 获取title的行数，如果是从上往下则是行，如果从左往右，则是列
     *
     * @return
     */
    protected abstract int getTitleRowNum();

    /**
     * 定义从第几列开始读取数据，将左边或上边的数据进行丢弃
     *
     * @return
     */
    protected abstract int getLeavedColNum();

    /**
     * 判断是否结束解析
     *
     * @return
     */
    protected boolean isEOF() {
        return false;
    }
}
