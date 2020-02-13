package Aspect.Structure.RawMaterials;

import Aspect.CivilizationAspect;
import Benefit.CivilizationBenefit;
import Benefit.ResourceSupply.FlexibleSupply;
import Resource.ResourceProfile;
import Resource.ResourceType;
import lombok.EqualsAndHashCode;
import java.util.Optional;
import java.util.Set;

@EqualsAndHashCode
public final class Mine extends RawMaterialsStructure {

    public Mine() {
    }

    @Override
    public Set<CivilizationBenefit> getBenefits() {
        return Set.<CivilizationBenefit>of(new FlexibleSupply(ResourceType.ORE, ResourceType.STONE));
    }

    @Override
    public Optional<CivilizationAspect> getPrerequisiteAspect() {
        return Optional.empty();
    }

    @Override
    public Integer getFinancialCost() {
        return 1;
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
