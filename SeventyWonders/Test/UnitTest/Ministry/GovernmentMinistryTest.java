package UnitTest.Ministry;

import Ministry.GovernmentMinistry;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.MinistryOfNationalResourceTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GovernmentMinistryTest implements SingleClassUnitTest<GovernmentMinistry> {

    @Override
    public void clearInstance(@Jailbreak GovernmentMinistry instance) {
        instance.homeCivilization = null;
    }

    @Override
    public GovernmentMinistry createRealInstance() {
        return MinistryOfNationalResourceTest.createRealInstance();
    }

    @Test
    public void test_equals_positive() {
        // TODO compare two objects with different homeCivilization
        assertEquals(this.createInstance(), this.createInstance());
    }

    @Test
    public void test_equals_negative() {
        // cannot be not equal
    }
}
