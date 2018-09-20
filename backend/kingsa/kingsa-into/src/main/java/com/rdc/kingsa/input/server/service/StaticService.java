package com.rdc.kingsa.input.server.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.common.constant.ShuiWenSTHYEnum;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = Exception.class)
@Service("staticService")
public class StaticService {
    public final String key = "key";
    public final String value = "value";

    public Map<String, List<Map<Object, Object>>> staticDatas() {
        Map<String, List<Map<Object, Object>>> result = Maps.newHashMap();
        List<Map<Object, Object>> systemList = Lists.newArrayList();
        for (ShuiWenSTHYEnum.SystemType type : ShuiWenSTHYEnum.SystemType.values()) {
            Map<Object, Object> map = new HashMap<>();
            map.put(key, type.getCode());
            map.put(value, type.getDesc());
            systemList.add(map);
        }
        result.put(KingsaInputConstant.SHUIWEN_TYPE, systemList);

        List<Map<Object, Object>> shenpiList = Lists.newArrayList();
        for (ShuiWenSTHYEnum.ShenPiType type : ShuiWenSTHYEnum.ShenPiType.values()) {
            Map<Object, Object> map = new HashMap<>();
            map.put(key, type.getCode());
            map.put(value, type.getDesc());
            shenpiList.add(map);
        }
        result.put(KingsaInputConstant.SHENPI_TYPE, shenpiList);
        return result;
    }

}
