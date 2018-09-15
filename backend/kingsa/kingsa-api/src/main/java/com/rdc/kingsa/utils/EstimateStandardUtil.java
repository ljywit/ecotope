package com.rdc.kingsa.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lxf on 18/9/13.
 */
public class EstimateStandardUtil {
    private Map<String, TrunkStandard> trunkStore = new HashMap<>();
    private Map<String, DrainStandard> drainStore = new HashMap<>();


    public EstimateStandardUtil() {
        this.initTrunkStore();
        this.initDrainStore();
    }

    private void initTrunkStore() {
        trunkStore.put("ph值类别", new TrunkStandard(
                9, 1, 6, 1,
                9, 1, 6, 1,
                9, 1, 6, 1,
                9, 1, 6, 1,
                9, 1, 6, 1));
        trunkStore.put("溶解氧类别", new TrunkStandard(
                99999, 0, 7.5, 1,
                7.5, 0, 6, 1,
                6, 0, 5, 1,
                5, 0, 3, 1,
                3, 0, 2, 1));
        trunkStore.put("高锰酸盐类别", new TrunkStandard(
                15, 1, 0, 1,
                4, 1, 2, 0,
                6, 1, 4, 0,
                10, 1, 6, 0,
                15, 1, 10, 0));
        trunkStore.put("化学需氧量类别", new TrunkStandard(
                15, 0, 0, 1,
                15, 1, 15, 1,
                20, 1, 15, 0,
                30, 1, 20, 0,
                40, 1, 30, 0));
        trunkStore.put("五日生化需氧量类别", new TrunkStandard(
                3, 0, 0, 1,
                3, 1, 3, 1,
                4, 1, 3, 0,
                6, 1, 4, 0,
                10, 1, 6, 0));
        trunkStore.put("氨氮类别", new TrunkStandard(
                0.15, 1, 0, 1,
                0.5, 1, 0.15, 0,
                1, 1, 0.5, 0,
                1.5, 1, 1, 0,
                2, 1, 1.5, 0));
        trunkStore.put("总磷类别", new TrunkStandard(
                0.02, 1, 0, 1,
                0.1, 1, 0.02, 0,
                0.2, 1, 0.1, 0,
                0.3, 1, 0.2, 0,
                0.4, 1, 0.3, 0));
        trunkStore.put("铜类别", new TrunkStandard(
                0.01, 1, 0, 1,
                1, 1, 0.01, 0,
                1, 1, 1, 1,
                1, 1, 1, 1,
                1, 1, 1, 1));
        trunkStore.put("锌类别", new TrunkStandard(
                0.05, 1, 0, 1,
                1, 0, 0.05, 0,
                1, 1, 1, 1,
                2, 0, 1, 0,
                2, 1, 2, 1));
        trunkStore.put("氟化物类别", new TrunkStandard(
                1, 0, 0, 1,
                1, 1, 1, 1,
                1, 1, 1, 1,
                1.5, 1, 1, 0,
                1.5, 1, 1.5, 1));
        trunkStore.put("硒类别", new TrunkStandard(
                0.01, 0, 0, 1,
                0.01, 1, 0.01, 1,
                0.01, 1, 0.01, 1,
                0.02, 0, 0.01, 0,
                0.02, 1, 0.02, 1));
        trunkStore.put("砷类别", new TrunkStandard(
                0.05, 0, 0, 1,
                0.05, 1, 0.05, 1,
                0.05, 1, 0.05, 1,
                0.1, 0, 0.05, 0,
                0.1, 1, 0.1, 1));
        trunkStore.put("汞类别", new TrunkStandard(
                0.00005, 0, 0, 1,
                0.00005, 1, 0.00005, 1,
                0.0001, 1, 0.00005, 1,
                0.001, 0, 0.0001, 0,
                0.001, 1, 0.001, 1));
        trunkStore.put("镉类别", new TrunkStandard(
                0.001, 1, 0, 1,
                0.005, 1, 0.005, 1,
                0.005, 1, 0.005, 1,
                0.005, 1, 0.005, 1,
                0.01, 1, 0.005, 0));
        trunkStore.put("六价铬类别", new TrunkStandard(
                0.01, 1, 0, 1,
                0.05, 1, 0.01, 0,
                0.05, 1, 0.05, 1,
                0.05, 1, 0.05, 1,
                0.1, 1, 0.05, 0));
        trunkStore.put("铅类别", new TrunkStandard(
                0.01, 0, 0, 1,
                0.01, 1, 0.01, 1,
                0.05, 1, 0.01, 0,
                0.05, 1, 0.05, 1,
                0.1, 1, 0.05, 0));
        trunkStore.put("氰化物类别", new TrunkStandard(
                0.005, 1, 0, 1,
                0.05, 1, 0.005, 0,
                0.2, 1, 0.05, 0,
                0.2, 1, 0.2, 0,
                0.2, 1, 0.2, 1));
        trunkStore.put("挥发酚类别", new TrunkStandard(
                0.002, 0, 0, 1,
                0.002, 1, 0.002, 1,
                0.005, 1, 0.002, 0,
                0.01, 1, 0.005, 0,
                0.1, 1, 0.01, 0));
        trunkStore.put("石油类类别", new TrunkStandard(
                0.05, 0, 0, 1,
                0.05, 1, 0.05, 1,
                0.05, 1, 0.05, 1,
                0.5, 1, 0.05, 0,
                1, 1, 0.5, 0));
        trunkStore.put("阴离子表面活性剂类别", new TrunkStandard(
                0.2, 0, 0, 1,
                0.2, 1, 0.2, 1,
                0.2, 1, 0.2, 1,
                0.3, 1, 0.2, 0,
                0.3, 1, 0.3, 1));
        trunkStore.put("硫化物类别", new TrunkStandard(
                0.05, 1, 0, 1,
                0.1, 1, 0.05, 0,
                0.2, 1, 0.1, 0,
                0.5, 1, 0.2, 0,
                1, 1, 0.5, 0));
    }

    private void initDrainStore() {
        drainStore.put("ph值类别", new DrainStandard(
                9, 1, 6, 1,
                9, 1, 6, 1,
                9, 1, 6, 1));
        drainStore.put("化学需氧量类别", new DrainStandard(
                100, 1, 0, 1,
                150, 1, 100, 0,
                500, 1, 150, 0));
        drainStore.put("五日生化需氧量类别", new DrainStandard(
                20, 1, 0, 1,
                30, 1, 20, 0,
                300, 1, 30, 0));
        drainStore.put("总磷类别", new DrainStandard(
                0.5, 1, 0, 1,
                1, 1, 0.5, 0,
                1, 1, 1, 0));
        drainStore.put("氨氮类别", new DrainStandard(
                15, 1, 0, 1,
                25, 1, 15, 0,
                25, 1, 25, 0));
        drainStore.put("硫化物类别", new DrainStandard(
                1, 1, 0, 1,
                1, 1, 1, 1,
                1, 1, 1, 1));
        drainStore.put("氰化物类别", new DrainStandard(
                0.5, 0, 0, 1,
                0.5, 1, 0.5, 1,
                1, 1, 0.5, 0));
        drainStore.put("氟化物类别", new DrainStandard(
                10, 0, 0, 1,
                10, 1, 10, 1,
                20, 1, 10, 0));
        drainStore.put("挥发酚类别", new DrainStandard(
                0.5, 0, 0, 1,
                0.5, 1, 0.5, 1,
                2, 1, 0.5, 0));
        drainStore.put("石油类类别", new DrainStandard(
                5, 1, 0, 1,
                10, 1, 5, 0,
                20, 1, 10, 0));
        drainStore.put("阴离子表面活性剂类别", new DrainStandard(
                5, 1, 0, 1,
                10, 1, 5, 0,
                20, 1, 10, 0));
        drainStore.put("铜类别", new DrainStandard(
                0.5, 1, 0, 1,
                1, 1, 0.5, 0,
                2, 1, 1, 0));
        drainStore.put("锌类别", new DrainStandard(
                2, 1, 0, 1,
                5, 0, 2, 0,
                5, 1, 5, 1));
        drainStore.put("六价铬类别", new DrainStandard(
                0.5, 0, 0, 1,
                0.5, 1, 0.5, 1,
                0.5, 1, 0.5, 1));
        drainStore.put("砷类别", new DrainStandard(
                0.5, 0, 0, 1,
                0.5, 1, 0.5, 1,
                0.5, 1, 0.5, 1));
        drainStore.put("汞类别", new DrainStandard(
                0.05, 0, 0, 1,
                0.05, 1, 0.05, 1,
                0.05, 1, 0.05, 1));
        drainStore.put("铅类别", new DrainStandard(
                1, 0, 0, 1,
                1, 1, 1, 1,
                1, 1, 1, 1));
        drainStore.put("镉类别", new DrainStandard(
                0.1, 0, 0, 1,
                0.1, 1, 0.1, 1,
                0.1, 1, 0.1, 1));
    }

    public TrunkStandard selectTrunkByEvaluateItem(String name) {
        if (this.trunkStore.containsKey(name)) {
            return this.trunkStore.get(name);
        } else {
            System.out.println("未找到指定名称的评价标准");
            return null;
        }
    }

    public DrainStandard selectDrainOutletByEvaluateItem(String name) {
        if (this.drainStore.containsKey(name)) {
            return this.drainStore.get(name);
        } else {
            System.out.println("未找到指定名称的评价标准");
            return null;
        }
    }
}
