package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.DedicatedSupply;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.ResourceSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class DedicatedSupplyTest implements SingleClassUnitTest<DedicatedSupply> {

    @Override
    public void clearInstance(DedicatedSupply instance) {
        ResourceSupplyTest.clearInstance(instance);
    }

    @Override
    public DedicatedSupply createRealInstance() {
        return new DedicatedSupply();
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
