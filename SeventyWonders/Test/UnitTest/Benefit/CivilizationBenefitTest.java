package UnitTest.Benefit;

import Benefit.CivilizationBenefit;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.ResourceSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CivilizationBenefitTest implements SingleClassUnitTest<CivilizationBenefit> {

    @Override
    public void clearInstance(CivilizationBenefit instance) {
    }

    @Override
    public CivilizationBenefit createRealInstance() {
        return ResourceSupplyTest.createRealInstance();
    }

    @Test
    public void test_equals_positive() {
        assertEquals(this.createInstance(), this.createInstance());
    }

    @Test
    public void test_equals_negative() {
        // cannot be not equal
    }
}
