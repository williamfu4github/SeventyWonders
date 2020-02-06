package Utility;

import UnitTest.Benefit.CivilizationBenefitTest;
import UnitTest.Benefit.ResourceSupply.DedicatedSupplyTest;
import UnitTest.Benefit.ResourceSupply.ResourceSupplyTest;
import UnitTest.Resource.ResourceProfileTest;

public final class TestInstanceFactory {

    public static ResourceProfileTest ResourceProfileTest;
    public static CivilizationBenefitTest CivilizationBenefitTest;
    public static ResourceSupplyTest ResourceSupplyTest;
    public static DedicatedSupplyTest DedicatedSupplyTest;

    static {
        ResourceProfileTest = new ResourceProfileTest();
        CivilizationBenefitTest = new CivilizationBenefitTest();
        ResourceSupplyTest = new ResourceSupplyTest();
        DedicatedSupplyTest = new DedicatedSupplyTest();
    }
}
