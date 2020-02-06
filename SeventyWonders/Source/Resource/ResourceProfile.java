package Resource;

import com.google.common.base.Preconditions;
import lombok.EqualsAndHashCode;
import java.util.Map;
import java.util.stream.Stream;

@EqualsAndHashCode
public final class ResourceProfile {

    @EqualsAndHashCode.Include
    private Map<ResourceType, Integer> resourceItems;

    public static ResourceProfile emptyProfile() {
        return new ResourceProfile();
    }

    public static ResourceProfile copyOf(ResourceProfile other) {
        return new ResourceProfile(other);
    }

    public ResourceProfile setResourceAmount(ResourceType resourceType, Integer amount) {
        Preconditions.checkArgument(amount >= 0);
        this.resourceItems.put(resourceType, amount);
        return this;
    }

    private ResourceProfile() {
        this.resourceItems = Stream.of(ResourceType.values())
                .toMap(type -> type, type -> 0);
    }

    private ResourceProfile(ResourceProfile other) {
        this.resourceItems = Map.copyOf(other.resourceItems);
    }
}
