package UnitTest.Aspect;

import Aspect.CivilizationAspect;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.CivilizationStructureTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CivilizationAspectTest implements SingleClassUnitTest<CivilizationAspect> {

    @Override
    public void clearInstance(CivilizationAspect instance) {
    }

    @Override
    public CivilizationAspect createRealInstance() {
        return CivilizationStructureTest.createRealInstance();
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
