package service;

import annotation.MonitoringField;
import model.WaterQualityEstimateBO;

import java.lang.reflect.Field;

/**
 * Created by lxf on 18/9/14.
 */
public abstract class EstimateBase {

    protected void estimateQaType(WaterQualityEstimateBO estimate) throws Exception {
        Class clazz = estimate.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder overItems = new StringBuilder();
        short worst = 0;
        for (Field field : fields) {
            MonitoringField monitoringField = field.getAnnotation(MonitoringField.class);
            if (monitoringField != null) {
                field.setAccessible(true);
                Short qaType = (Short) field.get(estimate);
                if (qaType == null) continue;
                if (worst < qaType) worst = qaType;
                short cordon = monitoringField.cordon();
                if (qaType > cordon) overItems.append(field.getName()).append(",");
            }
        }
        String overItemsStr = overItems.toString();
        if (overItems.lastIndexOf(",") > 0) {
            overItemsStr = overItems.substring(0, overItems.length() - 1);
        }
        estimate.setQaType(worst);
        estimate.setOverItems(overItemsStr);
    }
}
