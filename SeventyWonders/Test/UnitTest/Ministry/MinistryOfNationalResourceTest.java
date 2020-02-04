package UnitTest.Ministry;

import Civilization.HumanCivilization;
import Ministry.MinistryOfNationalResource;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.GovernmentMinistryTest;
import static Utility.TestInstanceFactory.HumanCivilizationTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class MinistryOfNationalResourceTest implements SingleClassUnitTest<MinistryOfNationalResource> {

    @Override
    public void clearInstance(MinistryOfNationalResource instance) {
        GovernmentMinistryTest.clearInstance(instance);
    }

    @Override
    public MinistryOfNationalResource createRealInstance() {
        return new MinistryOfNationalResource(HumanCivilizationTest.createInstance());
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
    public void test_constructor_happyPath() {
        HumanCivilization civilization = HumanCivilizationTest.createInstance();
        @Jailbreak MinistryOfNationalResource ministry = new MinistryOfNationalResource(civilization);
        assertEquals(civilization, ministry.homeCivilization);
    }
}
