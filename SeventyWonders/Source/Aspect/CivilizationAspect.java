package Aspect;

import Benefit.CivilizationBenefit;
import Resource.ResourceProfile;
import lombok.EqualsAndHashCode;
import java.util.Optional;
import java.util.Set;

@EqualsAndHashCode
public abstract class CivilizationAspect {

    protected CivilizationAspect() {
    }

    public abstract Set<CivilizationBenefit> getBenefits();

    public abstract Optional<CivilizationAspect> getPrerequisiteAspect();

    public abstract Integer getFinancialCost();

    public abstract ResourceProfile getResourceCost();

    public abstract Optional<CivilizationAspect> getInspiringAspect();
}
