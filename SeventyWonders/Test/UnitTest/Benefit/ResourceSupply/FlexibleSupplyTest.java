package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.FlexibleSupply;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.ResourceSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FlexibleSupplyTest implements SingleClassUnitTest<FlexibleSupply> {

    @Override
    public void clearInstance(FlexibleSupply instance) {
        ResourceSupplyTest.clearInstance(instance);
    }

    @Override
    public FlexibleSupply createRealInstance() {
        return new FlexibleSupply();
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
