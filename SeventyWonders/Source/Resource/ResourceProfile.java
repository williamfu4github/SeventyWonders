package Resource;

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

    private ResourceProfile() {
        this.resourceItems = Stream.of(ResourceType.values())
                .toMap(type -> type, type -> 0);
    }

    private ResourceProfile(ResourceProfile other) {
        this.resourceItems = Map.copyOf(other.resourceItems);
    }
}
