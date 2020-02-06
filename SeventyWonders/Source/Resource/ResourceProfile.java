package Resource;

import lombok.EqualsAndHashCode;
import java.util.Map;
import java.util.stream.Stream;

@EqualsAndHashCode
public final class ResourceProfile {

    @EqualsAndHashCode.Include
    private Map<ResourceType, Integer> resourceItems;

    public ResourceProfile() {
        this.resourceItems = Stream.of(ResourceType.values())
                .toMap(type -> type, type -> 0);
    }
}
