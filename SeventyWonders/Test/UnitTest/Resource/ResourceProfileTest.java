package UnitTest.Resource;

import Resource.ResourceProfile;
import TesterBase.UnitTest.SingleClassUnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ResourceProfileTest implements SingleClassUnitTest<ResourceProfile> {

    @Override
    public void clearInstance(ResourceProfile instance) {
    }

    @Override
    public ResourceProfile createRealInstance() {
        return new ResourceProfile();
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
