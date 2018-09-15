import com.rdc.kingsa.model.bo.water.quality.WaterQualityEstimateBO;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;
import com.rdc.kingsa.service.SingleFactorEstimateService;
import org.junit.Test;
import com.rdc.kingsa.service.inf.SingleFactorEstimate;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/9/14.
 */
public class TrunkTest {


    @Test
    public void test() {
        WaterQualityMIBase mi = new WaterQualityMIBase();
        mi.setWaterTemp(BigDecimal.valueOf(14));
        mi.setPhValue(BigDecimal.valueOf(8));
        mi.setDisOxygen(BigDecimal.valueOf(7.9));
        mi.setPermanganate(BigDecimal.valueOf(0.8));
        mi.setOxDemand(BigDecimal.valueOf(10));
        mi.setBoDemand(BigDecimal.valueOf(0.5));
        mi.setAmmonia(BigDecimal.valueOf(0.025));
        mi.setPhosphorus(BigDecimal.valueOf(0.02));
        mi.setCopper(BigDecimal.valueOf(0.005));
        mi.setZinc(BigDecimal.valueOf(0.05));
        mi.setFluoride(BigDecimal.valueOf(0.12));
        mi.setSelenium(BigDecimal.valueOf(0.0003));
        mi.setArsenic(BigDecimal.valueOf(0.0007));
        mi.setMercury(BigDecimal.valueOf(0.00005));
        mi.setCadmium(BigDecimal.valueOf(0.001));
        mi.setChromium(BigDecimal.valueOf(0.004));
        mi.setLead(BigDecimal.valueOf(0.01));
        mi.setCyanide(BigDecimal.valueOf(0.002));
        mi.setPhenol(BigDecimal.valueOf(0.002));
        mi.setPetroleum(BigDecimal.valueOf(0.01));
        mi.setSurfactant(BigDecimal.valueOf(0.05));
        mi.setSulfide(BigDecimal.valueOf(0.5));
        mi.setTransparency(BigDecimal.valueOf(0.1));
        mi.setChlorA(BigDecimal.valueOf(0.0008));

        SingleFactorEstimate estimate = new SingleFactorEstimateService();
        try {
            WaterQualityEstimateBO bo = estimate.trunkEstimate(mi);
            System.out.println(bo.getOverItems());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
