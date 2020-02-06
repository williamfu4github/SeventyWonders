package Benefit.ResourceSupply;

import Resource.ResourceType;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class DedicatedSupply extends ResourceSupply {

    @EqualsAndHashCode.Include
    private ResourceType dedicatedItem;

    public DedicatedSupply(ResourceType dedicatedItem) {
        this.dedicatedItem = dedicatedItem;
    }
}
