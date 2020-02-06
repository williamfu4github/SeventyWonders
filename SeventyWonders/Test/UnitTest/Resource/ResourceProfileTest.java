package UnitTest.Resource;

import Resource.ResourceProfile;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public final class ResourceProfileTest implements SingleClassUnitTest<ResourceProfile> {

    @Override
    public void clearInstance(@Jailbreak ResourceProfile instance) {
        instance.resourceItems.clear();
    }

    @Override
    public ResourceProfile createRealInstance() {
        return ResourceProfile.emptyProfile();
    }

    @Test
    public void test_equals_positive() {
        @Jailbreak ResourceProfile profile1 = this.createInstance();
        profile1.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.STONE, 2);
        @Jailbreak ResourceProfile profile2 = this.createInstance();
        profile2.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.STONE, 2);
        assertEquals(profile1, profile2);
    }

    @Test
    public void test_equals_negative() {
        @Jailbreak ResourceProfile profile1 = this.createInstance();
        profile1.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.STONE, 2);
        @Jailbreak ResourceProfile profile2 = this.createInstance();
        profile2.resourceItems
                .set(ResourceType.WOOD, 1)
                .set(ResourceType.STONE, 1);
        assertNotEquals(profile1, profile2);
    }

    @Test
    public void test_emptyProfile_happyPath() {
        @Jailbreak ResourceProfile profile = this.createInstance();
        profile.resourceItems
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.STONE, 0)
                .set(ResourceType.CLAY, 0)
                .set(ResourceType.ORE, 0)
                .set(ResourceType.GLASS, 0)
                .set(ResourceType.TEXTILE, 0)
                .set(ResourceType.PAPYRUS, 0);
        assertEquals(profile, ResourceProfile.emptyProfile());
    }

    @Test
    public void test_constructor_happyPath() {
        Map<ResourceType, Integer> resources = Map.<ResourceType, Integer>emptyMap()
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.STONE, 0)
                .set(ResourceType.CLAY, 0)
                .set(ResourceType.ORE, 0)
                .set(ResourceType.GLASS, 0)
                .set(ResourceType.TEXTILE, 0)
                .set(ResourceType.PAPYRUS, 0);
        @Jailbreak ResourceProfile profile = new @Jailbreak ResourceProfile();
        assertEquals(resources, profile.resourceItems);
    }
}
