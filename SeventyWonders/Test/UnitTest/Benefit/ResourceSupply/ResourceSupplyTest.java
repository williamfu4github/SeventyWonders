package UnitTest.Benefit.ResourceSupply;

import Benefit.ResourceSupply.ResourceSupply;
import Resource.ResourceProfile;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.Set;
import static Utility.TestInstanceFactory.CivilizationBenefitTest;
import static Utility.TestInstanceFactory.DedicatedSupplyTest;
import static Utility.TestInstanceFactory.ResourceProfileTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.powermock.api.mockito.PowerMockito.when;

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

    @Test
    public void test_markResourceContribution_invalidArgument_noProfiles() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.createInstance().markResourceContribution(Collections.emptySet());
        });
    }

    @Test
    public void test_markResourceContribution_happyPath_noOptions() {
        @Jailbreak ResourceProfile profile = ResourceProfileTest.createInstance();
        profile.resourceItems.set(ResourceType.WOOD, 1);
        @Jailbreak ResourceSupply supply = this.createSpyInstance();
        when(supply.getPossibleSupplies()).thenReturn(Collections.emptySet());
        assertEquals(Set.of(profile), supply.markResourceContribution(Set.of(profile)));
    }

    @Test
    public void test_markResourceContribution_happyPath_singleOption() {
        @Jailbreak ResourceProfile profile1 = ResourceProfileTest.createInstance();
        profile1.resourceItems.set(ResourceType.WOOD, 1);
        @Jailbreak ResourceProfile profile2 = ResourceProfileTest.createInstance();
        profile2.resourceItems.set(ResourceType.WOOD, 2);
        @Jailbreak ResourceProfile profile3 = ResourceProfileTest.createInstance();
        profile3.resourceItems.set(ResourceType.WOOD, 3);
        @Jailbreak ResourceSupply supply = this.createSpyInstance();
        when(supply.getPossibleSupplies()).thenReturn(Set.of(ResourceType.WOOD));
        assertEquals(Set.of(profile2, profile3), supply.markResourceContribution(Set.of(profile1, profile2)));
    }

    @Test
    public void test_markResourceContribution_happyPath_multipleOptionsNoDuplicateResult() {
        @Jailbreak ResourceProfile profile1 = ResourceProfileTest.createInstance();
        profile1.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.CLAY, 0);
        @Jailbreak ResourceProfile profile2 = ResourceProfileTest.createInstance();
        profile2.resourceItems
                .set(ResourceType.WOOD, 2)
                .set(ResourceType.CLAY, 0);
        @Jailbreak ResourceProfile profile3 = ResourceProfileTest.createInstance();
        profile3.resourceItems
                .set(ResourceType.WOOD, 3)
                .set(ResourceType.CLAY, 0);
        @Jailbreak ResourceProfile profile4 = ResourceProfileTest.createInstance();
        profile4.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.CLAY, 1);
        @Jailbreak ResourceProfile profile5 = ResourceProfileTest.createInstance();
        profile5.resourceItems
                .set(ResourceType.WOOD, 2)
                .set(ResourceType.CLAY, 1);
        @Jailbreak ResourceSupply supply = this.createSpyInstance();
        when(supply.getPossibleSupplies()).thenReturn(Set.of(ResourceType.WOOD, ResourceType.CLAY));
        assertEquals(Set.of(profile2, profile3, profile4, profile5), supply.markResourceContribution(Set.of(profile1, profile2)));
    }

    @Test
    public void test_markResourceContribution_happyPath_multipleOptionsWithDuplicateResult() {
        @Jailbreak ResourceProfile profile1 = ResourceProfileTest.createInstance();
        profile1.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.CLAY, 0);
        @Jailbreak ResourceProfile profile2 = ResourceProfileTest.createInstance();
        profile2.resourceItems
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.CLAY, 1);
        @Jailbreak ResourceProfile profile3 = ResourceProfileTest.createInstance();
        profile3.resourceItems
                .set(ResourceType.WOOD, 2)
                .set(ResourceType.CLAY, 0);
        @Jailbreak ResourceProfile profile4 = ResourceProfileTest.createInstance();
        profile4.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.CLAY, 1);
        @Jailbreak ResourceProfile profile5 = ResourceProfileTest.createInstance();
        profile5.resourceItems
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.CLAY, 2);
        @Jailbreak ResourceSupply supply = this.createSpyInstance();
        when(supply.getPossibleSupplies()).thenReturn(Set.of(ResourceType.WOOD, ResourceType.CLAY));
        assertEquals(Set.of(profile3, profile4, profile5), supply.markResourceContribution(Set.of(profile1, profile2)));
    }
}
