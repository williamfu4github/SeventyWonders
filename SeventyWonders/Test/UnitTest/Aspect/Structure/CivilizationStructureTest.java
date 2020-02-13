package UnitTest.Aspect.Structure;

import Aspect.Structure.CivilizationStructure;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.CivilizationAspectTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CivilizationStructureTest implements SingleClassUnitTest<CivilizationStructure> {

    @Override
    public void clearInstance(CivilizationStructure instance) {
        CivilizationAspectTest.clearInstance(instance);
    }

    @Override
    public CivilizationStructure createRealInstance() {
        // TODO return real object
        return null;
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
