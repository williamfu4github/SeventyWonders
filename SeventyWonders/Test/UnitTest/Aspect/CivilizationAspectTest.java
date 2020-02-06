package UnitTest.Aspect;

import Aspect.CivilizationAspect;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CivilizationAspectTest implements SingleClassUnitTest<CivilizationAspect> {

    @Override
    public void clearInstance(CivilizationAspect instance) {
    }

    @Override
    public CivilizationAspect createRealInstance() {
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
