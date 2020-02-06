package Benefit.ResourceSupply;

import Benefit.CivilizationBenefit;
import Resource.ResourceType;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode
public abstract class ResourceSupply extends CivilizationBenefit {

    protected ResourceSupply() {
    }

    protected abstract Set<ResourceType> getPossibleSupplies();
}
