package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.FlexibleSupply;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static Utility.TestInstanceFactory.ResourceSupplyTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public final class FlexibleSupplyTest implements SingleClassUnitTest<FlexibleSupply> {

    @Override
    public void clearInstance(@Jailbreak FlexibleSupply instance) {
        ResourceSupplyTest.clearInstance(instance);
        instance.possibleItems.clear();
    }

    @Override
    public FlexibleSupply createRealInstance() {
        return new FlexibleSupply(ResourceType.ORE, ResourceType.WOOD);
    }

    @Test
    public void test_equals_positive() {
        @Jailbreak FlexibleSupply supply1 = this.createInstance();
        supply1.possibleItems = Set.of(ResourceType.ORE, ResourceType.WOOD);
        @Jailbreak FlexibleSupply supply2 = this.createInstance();
        supply2.possibleItems = Set.of(ResourceType.ORE, ResourceType.WOOD);
        assertEquals(supply1, supply2);
    }

    @Test
    public void test_equals_negative() {
        @Jailbreak FlexibleSupply supply1 = this.createInstance();
        supply1.possibleItems = Set.of(ResourceType.ORE, ResourceType.WOOD);
        @Jailbreak FlexibleSupply supply2 = this.createInstance();
        supply2.possibleItems = Set.of(ResourceType.ORE, ResourceType.CLAY);
        assertNotEquals(supply1, supply2);
    }

    @Test
    public void test_constructor_invalidArgument_duplicateSupplyOption() {
        assertThrows(IllegalArgumentException.class, () -> {
            new FlexibleSupply(ResourceType.ORE, ResourceType.WOOD, ResourceType.ORE);
        });
    }

    @Test
    public void test_constructor_happyPath() {
        @Jailbreak FlexibleSupply supply = new FlexibleSupply(ResourceType.ORE, ResourceType.WOOD, ResourceType.CLAY);
        assertEquals(Set.of(ResourceType.ORE, ResourceType.WOOD, ResourceType.CLAY), supply.possibleItems);
    }
}
