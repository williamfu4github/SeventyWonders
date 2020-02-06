package Utility;

import UnitTest.Resource.ResourceProfileTest;

public final class TestInstanceFactory {

    public static ResourceProfileTest ResourceProfileTest;

    static {
        ResourceProfileTest = new ResourceProfileTest();
    }
}
