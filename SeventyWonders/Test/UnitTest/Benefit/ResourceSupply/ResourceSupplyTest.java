package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.ResourceSupply;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.CivilizationBenefitTest;
import static Utility.TestInstanceFactory.DedicatedSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ResourceSupplyTest implements SingleClassUnitTest<ResourceSupply> {

    @Override
    public void clearInstance(ResourceSupply instance) {
        CivilizationBenefitTest.clearInstance(instance);
    }

    @Override
    public ResourceSupply createRealInstance() {
        return DedicatedSupplyTest.createRealInstance();
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
