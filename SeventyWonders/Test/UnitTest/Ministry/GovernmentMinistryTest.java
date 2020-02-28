package UnitTest.Ministry;

import Ministry.GovernmentMinistry;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GovernmentMinistryTest implements SingleClassUnitTest<GovernmentMinistry> {

    @Override
    public void clearInstance(GovernmentMinistry instance) {
    }

    @Override
    public GovernmentMinistry createRealInstance() {
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
