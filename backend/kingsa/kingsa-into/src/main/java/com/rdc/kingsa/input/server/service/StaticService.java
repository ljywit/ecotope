package com.rdc.kingsa.input.server.service;

import com.google.common.collect.Lists;
import com.rdc.kingsa.input.common.constant.ApprovalTypeEnum;
import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.common.constant.SystemTypeEnum;
import com.rdc.kingsa.input.persistence.dist.SectionAllStore;
import com.rdc.kingsa.input.server.controller.model.base.data.SectionMD;
import com.rdc.kingsa.input.server.controller.model.base.data.StaticMD;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = Exception.class)
@Service("staticService")
public class StaticService {

    //@Autowired
    @Resource(name = "sectionAllStore")
    private SectionAllStore sectionAllStore;

    public StaticMD staticDatas() {
        StaticMD result = new StaticMD();
        Map<String, Object> datas = new HashMap<>();
        result.setDatas(datas);
        typeDatas(result);

        List<SectionMD> allSection = sectionAllStore.getAllSection();
        result.getDatas().put(KingsaInputConstant.SECTION, allSection);


        return result;
    }

    public void typeDatas(StaticMD result) {
        List<Map<Object, Object>> systemList = Lists.newArrayList();
        List<Map<Object, Object>> downloadTemplateList = Lists.newArrayList();
        for (SystemTypeEnum type : SystemTypeEnum.values()) {
            Map<Object, Object> sysMap = new HashMap<>();
            Map<Object, Object> downloadTemplateMap = new HashMap<>();
            sysMap.put(KingsaInputConstant.STATIC_PARAM_KEY, type.getType());
            sysMap.put(KingsaInputConstant.STATIC_PARAM_VALUE, type.getDesc());
            systemList.add(sysMap);
            downloadTemplateMap.put(KingsaInputConstant.STATIC_PARAM_KEY, type.getType());
            //TODO
            downloadTemplateMap.put(KingsaInputConstant.STATIC_PARAM_VALUE, "");
            downloadTemplateList.add(downloadTemplateMap);
        }
        //typeMap.put(KingsaInputConstant.SHUIWEN_TYPE, systemList);
        result.getDatas().put(KingsaInputConstant.SHUIWEN_TYPE, systemList);
        result.getDatas().put(KingsaInputConstant.DOWNLOAD_TEMPALTE, downloadTemplateList);

        List<Map<Object, Object>> list = Lists.newArrayList();
        for (ApprovalTypeEnum type : ApprovalTypeEnum.values()) {
            Map<Object, Object> map = new HashMap<>();
            map.put(KingsaInputConstant.STATIC_PARAM_KEY, type.getType());
            map.put(KingsaInputConstant.STATIC_PARAM_VALUE, type.getDesc());
            list.add(map);
        }
        result.getDatas().put(KingsaInputConstant.APPROVAL_TYPE, list);
    }

}
