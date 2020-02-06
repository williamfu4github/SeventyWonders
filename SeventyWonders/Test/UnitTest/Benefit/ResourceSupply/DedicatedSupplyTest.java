package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.DedicatedSupply;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.ResourceSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public final class DedicatedSupplyTest implements SingleClassUnitTest<DedicatedSupply> {

    @Override
    public void clearInstance(@Jailbreak DedicatedSupply instance) {
        ResourceSupplyTest.clearInstance(instance);
        instance.dedicatedItem = null;
    }

    @Override
    public DedicatedSupply createRealInstance() {
        return new DedicatedSupply(ResourceType.ORE);
    }

    @Test
    public void test_equals_positive() {
        @Jailbreak DedicatedSupply supply1 = this.createInstance();
        supply1.dedicatedItem = ResourceType.ORE;
        @Jailbreak DedicatedSupply supply2 = this.createInstance();
        supply2.dedicatedItem = ResourceType.ORE;
        assertEquals(supply1, supply2);
    }

    @Test
    public void test_equals_negative() {
        @Jailbreak DedicatedSupply supply1 = this.createInstance();
        supply1.dedicatedItem = ResourceType.ORE;
        @Jailbreak DedicatedSupply supply2 = this.createInstance();
        supply2.dedicatedItem = ResourceType.WOOD;
        assertNotEquals(supply1, supply2);
    }

    @Test
    public void test_constructor_happyPath() {
        @Jailbreak DedicatedSupply supply = new DedicatedSupply(ResourceType.ORE);
        assertEquals(ResourceType.ORE, supply.dedicatedItem);
    }
}
