package Aspect.Structure.RawMaterials;

import Aspect.CivilizationAspect;
import Benefit.CivilizationBenefit;
import Benefit.ResourceSupply.DedicatedSupply;
import Resource.ResourceProfile;
import Resource.ResourceType;
import lombok.EqualsAndHashCode;
import java.util.Optional;
import java.util.Set;

@EqualsAndHashCode
public final class OreVein extends RawMaterialsStructure {

    public OreVein() {
    }

    @Override
    public Set<CivilizationBenefit> getBenefits() {
        return Set.<CivilizationBenefit>of(new DedicatedSupply(ResourceType.ORE));
    }

    @Override
    public Optional<CivilizationAspect> getPrerequisiteAspect() {
        return Optional.empty();
    }

    @Override
    public Integer getFinancialCost() {
        return 0;
    }

    @Override
    public ResourceProfile getResourceCost() {
        return ResourceProfile.emptyProfile();
    }

    @Override
    public Optional<CivilizationAspect> getInspiringAspect() {
        return Optional.empty();
    }
}
