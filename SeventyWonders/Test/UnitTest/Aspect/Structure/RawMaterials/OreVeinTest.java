package UnitTest.Aspect.Structure.RawMaterials;

import Aspect.Structure.RawMaterials.OreVein;
import Benefit.ResourceSupply.DedicatedSupply;
import Resource.ResourceProfile;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import java.util.Set;
import static Utility.TestInstanceFactory.RawMaterialsStructureTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class OreVeinTest implements SingleClassUnitTest<OreVein> {

    @Override
    public void clearInstance(OreVein instance) {
        RawMaterialsStructureTest.clearInstance(instance);
    }

    @Override
    public OreVein createRealInstance() {
        return new OreVein();
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
    public void test_getBenefits_happyPath() {
        assertEquals(Set.of(new DedicatedSupply(ResourceType.ORE)), this.createInstance().getBenefits());
    }

    @Test
    public void test_getPrerequisiteAspect_happyPath() {
        assertEquals(Optional.empty(), this.createInstance().getPrerequisiteAspect());
    }

    @Test
    public void test_getFinancialCost_happyPath() {
        assertEquals(0, this.createInstance().getFinancialCost());
    }

    @Test
    public void test_getResourceCost_happyPath() {
        assertEquals(ResourceProfile.emptyProfile(), this.createInstance().getResourceCost());
    }

    @Test
    public void test_getInspiringAspect_happyPath() {
        assertEquals(Optional.empty(), this.createInstance().getInspiringAspect());
    }
}
