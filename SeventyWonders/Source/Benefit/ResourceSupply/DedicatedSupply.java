package Benefit.ResourceSupply;

import Resource.ResourceType;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode
public final class DedicatedSupply extends ResourceSupply {

    @EqualsAndHashCode.Include
    private ResourceType dedicatedItem;

    public DedicatedSupply(ResourceType dedicatedItem) {
        this.dedicatedItem = dedicatedItem;
    }

    @Override
    protected Set<ResourceType> getPossibleSupplies() {
        return Set.of(this.dedicatedItem);
    }
}
