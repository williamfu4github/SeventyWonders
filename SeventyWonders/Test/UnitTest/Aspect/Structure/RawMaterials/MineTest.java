package UnitTest.Aspect.Structure.RawMaterials;

import Aspect.Structure.RawMaterials.Mine;
import Benefit.ResourceSupply.FlexibleSupply;
import Resource.ResourceProfile;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import java.util.Set;
import static Utility.TestInstanceFactory.RawMaterialsStructureTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class MineTest implements SingleClassUnitTest<Mine> {

    @Override
    public void clearInstance(Mine instance) {
        RawMaterialsStructureTest.clearInstance(instance);
    }

    @Override
    public Mine createRealInstance() {
        return new Mine();
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
        assertEquals(Set.of(new FlexibleSupply(ResourceType.ORE, ResourceType.STONE)), this.createInstance().getBenefits());
    }

    @Test
    public void test_getPrerequisiteAspect_happyPath() {
        assertEquals(Optional.empty(), this.createInstance().getPrerequisiteAspect());
    }

    @Test
    public void test_getFinancialCost_happyPath() {
        assertEquals(1, this.createInstance().getFinancialCost());
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
