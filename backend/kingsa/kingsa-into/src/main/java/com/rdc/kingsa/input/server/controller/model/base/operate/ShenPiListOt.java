package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.server.controller.model.base.data.BasicMsgMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("审批列表查询相应信息")
public class ShenPiListOt {
    /*@ApiModelProperty("水文生态系统Code,对应静态数据接口数据")
    private int shuiWencode;
    @ApiModelProperty("分页查询信息")
    private PageMD pagemd;*/
    @ApiModelProperty("结果集合")
    List<BasicMsgMD> basicMsgMDList;

    public List<BasicMsgMD> getBasicMsgMDList() {
        return basicMsgMDList;
    }

    public void setBasicMsgMDList(List<BasicMsgMD> basicMsgMDList) {
        this.basicMsgMDList = basicMsgMDList;
    }
}
