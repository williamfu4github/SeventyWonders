package Utility;

import UnitTest.Aspect.CivilizationAspectTest;
import UnitTest.Aspect.Structure.CivilizationStructureTest;
import UnitTest.Aspect.Structure.RawMaterials.MineTest;
import UnitTest.Aspect.Structure.RawMaterials.OreVeinTest;
import UnitTest.Aspect.Structure.RawMaterials.RawMaterialsStructureTest;
import UnitTest.Benefit.CivilizationBenefitTest;
import UnitTest.Benefit.ResourceSupply.DedicatedSupplyTest;
import UnitTest.Benefit.ResourceSupply.FlexibleSupplyTest;
import UnitTest.Benefit.ResourceSupply.ResourceSupplyTest;
import UnitTest.Civilization.HumanCivilizationTest;
import UnitTest.Ministry.GovernmentMinistryTest;
import UnitTest.Ministry.MinistryOfNationalResourceTest;
import UnitTest.Resource.ResourceProfileTest;

public final class TestInstanceFactory {

    public static ResourceProfileTest ResourceProfileTest;
    public static CivilizationBenefitTest CivilizationBenefitTest;
    public static ResourceSupplyTest ResourceSupplyTest;
    public static DedicatedSupplyTest DedicatedSupplyTest;
    public static FlexibleSupplyTest FlexibleSupplyTest;
    public static CivilizationAspectTest CivilizationAspectTest;
    public static CivilizationStructureTest CivilizationStructureTest;
    public static RawMaterialsStructureTest RawMaterialsStructureTest;
    public static MineTest MineTest;
    public static OreVeinTest OreVeinTest;
    public static HumanCivilizationTest HumanCivilizationTest;
    public static GovernmentMinistryTest GovernmentMinistryTest;
    public static MinistryOfNationalResourceTest MinistryOfNationalResourceTest;

    static {
        ResourceProfileTest = new ResourceProfileTest();
        CivilizationBenefitTest = new CivilizationBenefitTest();
        ResourceSupplyTest = new ResourceSupplyTest();
        DedicatedSupplyTest = new DedicatedSupplyTest();
        FlexibleSupplyTest = new FlexibleSupplyTest();
        CivilizationAspectTest = new CivilizationAspectTest();
        CivilizationStructureTest = new CivilizationStructureTest();
        RawMaterialsStructureTest = new RawMaterialsStructureTest();
        MineTest = new MineTest();
        OreVeinTest = new OreVeinTest();
        HumanCivilizationTest = new HumanCivilizationTest();
        GovernmentMinistryTest = new GovernmentMinistryTest();
        MinistryOfNationalResourceTest = new MinistryOfNationalResourceTest();
    }
}
