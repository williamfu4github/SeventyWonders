package Benefit.ResourceSupply;

import Benefit.CivilizationBenefit;
import Resource.ResourceProfile;
import Resource.ResourceType;
import com.google.common.base.Preconditions;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode
public abstract class ResourceSupply extends CivilizationBenefit {

    protected ResourceSupply() {
    }

    public Set<ResourceProfile> markResourceContribution(Set<ResourceProfile> possibleProfiles) {
        Preconditions.checkArgument(possibleProfiles.size() > 0);
        Set<ResourceType> possibleSupplies = this.getPossibleSupplies();
        return possibleSupplies.isEmpty() ? possibleProfiles : possibleProfiles.stream()
                .flatMap(profile -> possibleSupplies.stream()
                        .map(type -> ResourceProfile.copyOf(profile).increaseResourceAmount(type)))
                .toSet();
    }

    protected abstract Set<ResourceType> getPossibleSupplies();
}
