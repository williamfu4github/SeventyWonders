package UnitTest.Aspect.Structure.RawMaterials;

import Aspect.Structure.RawMaterials.RawMaterialsStructure;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.CivilizationStructureTest;
import static Utility.TestInstanceFactory.MineTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class RawMaterialsStructureTest implements SingleClassUnitTest<RawMaterialsStructure> {

    @Override
    public void clearInstance(RawMaterialsStructure instance) {
        CivilizationStructureTest.clearInstance(instance);
    }

    @Override
    public RawMaterialsStructure createRealInstance() {
        return MineTest.createRealInstance();
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
