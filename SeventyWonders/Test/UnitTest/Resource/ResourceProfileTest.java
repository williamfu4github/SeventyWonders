package UnitTest.Resource;

import Resource.ResourceProfile;
import Resource.ResourceType;
import TesterBase.UnitTest.SingleClassUnitTest;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void test_copyOf_happyPath() {
        @Jailbreak ResourceProfile profile = this.createInstance();
        profile.resourceItems
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.STONE, 1)
                .set(ResourceType.CLAY, 2)
                .set(ResourceType.ORE, 0)
                .set(ResourceType.GLASS, 1)
                .set(ResourceType.TEXTILE, 2)
                .set(ResourceType.PAPYRUS, 0);
        assertEquals(profile, ResourceProfile.copyOf(profile));
    }

    @Test
    public void test_setResourceAmount_invalidArgument_negativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.createInstance().setResourceAmount(ResourceType.ORE, -1);
        });
    }

    @Test
    public void test_setResourceAmount_happyPath() {
        @Jailbreak ResourceProfile profile = this.createInstance();
        profile.resourceItems.put(ResourceType.ORE, 2);
        profile.setResourceAmount(ResourceType.ORE, 5);
        assertEquals(5, profile.resourceItems.get(ResourceType.ORE));
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

    @Test
    public void test_copyConstructor_happyPath() {
        Map<ResourceType, Integer> resources = Map.<ResourceType, Integer>emptyMap()
                .set(ResourceType.WOOD, 0)
                .set(ResourceType.STONE, 1)
                .set(ResourceType.CLAY, 2)
                .set(ResourceType.ORE, 0)
                .set(ResourceType.GLASS, 1)
                .set(ResourceType.TEXTILE, 2)
                .set(ResourceType.PAPYRUS, 0);
        @Jailbreak ResourceProfile profile1 = this.createInstance();
        profile1.resourceItems = resources;
        @Jailbreak ResourceProfile profile2 = new @Jailbreak ResourceProfile(profile1);
        assertEquals(resources, profile2.resourceItems);
    }
}
