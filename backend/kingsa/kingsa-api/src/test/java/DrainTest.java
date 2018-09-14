import model.WaterQualityEstimateBO;
import model.WaterQualityMIBase;
import org.junit.Test;
import service.inf.SingleFactorEstimate;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/9/14.
 */
public class DrainTest {
    @Test
    public void test() {
        WaterQualityMIBase mi = new WaterQualityMIBase();
        mi.setWaterTemp(BigDecimal.valueOf(32));
        mi.setPhValue(BigDecimal.valueOf(6.1));
        mi.setDisOxygen(BigDecimal.valueOf(6.1));
        mi.setPermanganate(BigDecimal.valueOf(36.6));
        mi.setOxDemand(BigDecimal.valueOf(37));
        mi.setBoDemand(BigDecimal.valueOf(6));
        mi.setAmmonia(BigDecimal.valueOf(12.5));
        mi.setPhosphorus(BigDecimal.valueOf(0.21));
        mi.setNitrogen(BigDecimal.valueOf(32.6));
        mi.setCopper(BigDecimal.valueOf(0.328));
        mi.setZinc(BigDecimal.valueOf(1.07));
        mi.setFluoride(BigDecimal.valueOf(1.63));
        mi.setSelenium(BigDecimal.valueOf(0.01));
        mi.setArsenic(BigDecimal.valueOf(0.0163));
        mi.setMercury(BigDecimal.valueOf(0.00041));
        mi.setCadmium(BigDecimal.valueOf(0.003));
        mi.setChromium(BigDecimal.valueOf(0.004));
        mi.setLead(BigDecimal.valueOf(0.079));
        mi.setCyanide(BigDecimal.valueOf(0.008));
        mi.setPhenol(BigDecimal.valueOf(0.0728));
        mi.setPetroleum(BigDecimal.valueOf(0.01));
        mi.setSurfactant(BigDecimal.valueOf(0.37));
        mi.setSulfide(BigDecimal.valueOf(0.005));
        mi.setTransparency(BigDecimal.valueOf(0.2));
        mi.setChlorA(BigDecimal.valueOf(0.0005));

        SingleFactorEstimate estimate = new SingleFactorEstimateService();
        try {
            WaterQualityEstimateBO bo = estimate.drainOutletEstimate(mi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
