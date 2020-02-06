package Benefit.ResourceSupply;

import Resource.ResourceType;
import com.google.common.base.Preconditions;
import lombok.EqualsAndHashCode;
import java.util.Set;
import java.util.stream.Stream;

@EqualsAndHashCode
public final class FlexibleSupply extends ResourceSupply {

    @EqualsAndHashCode.Include
    private Set<ResourceType> possibleItems;

    public FlexibleSupply(ResourceType option1, ResourceType option2, ResourceType... otherOptions) {
        this.possibleItems = Stream.concat(Stream.of(option1, option2), Stream.of(otherOptions))
                .toSet();
        Preconditions.checkArgument(this.possibleItems.size() == otherOptions.length + 2, "possibleItems cannot have duplicates");
    }

    @Override
    protected Set<ResourceType> getPossibleSupplies() {
        return Set.copyOf(this.possibleItems);
    }
}
