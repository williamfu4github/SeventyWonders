package Utility;

import UnitTest.Benefit.CivilizationBenefitTest;
import UnitTest.Resource.ResourceProfileTest;

public final class TestInstanceFactory {

    public static ResourceProfileTest ResourceProfileTest;
    public static CivilizationBenefitTest CivilizationBenefitTest;

    static {
        ResourceProfileTest = new ResourceProfileTest();
        CivilizationBenefitTest = new CivilizationBenefitTest();
    }
}
