package UnitTest.Civilization;

import Civilization.HumanCivilization;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class HumanCivilizationTest implements SingleClassUnitTest<HumanCivilization> {

    @Override
    public void clearInstance(HumanCivilization instance) {
    }

    @Override
    public HumanCivilization createRealInstance() {
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
