package UnitTest.Civilization;

import Civilization.HumanCivilization;
import TesterBase.UnitTest.SingleClassUnitTest;
import com.google.common.collect.Multiset;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import static Utility.TestInstanceFactory.MineTest;
import static Utility.TestInstanceFactory.OreVeinTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public final class HumanCivilizationTest implements SingleClassUnitTest<HumanCivilization> {

    private final class HumanCivilizationSubclass extends HumanCivilization {
    }

    @Override
    public void clearInstance(@Jailbreak HumanCivilization instance) {
        instance.developedAspects.clear();
    }

    @Override
    public HumanCivilization createRealInstance() {
        // TODO return real object
        return new HumanCivilizationSubclass();
    }

    @Test
    public void test_equals_positive() {
        @Jailbreak HumanCivilization civilization1 = this.createInstance();
        civilization1.developedAspects
                .insert(MineTest.createInstance());
        @Jailbreak HumanCivilization civilization2 = this.createInstance();
        civilization2.developedAspects
                .insert(MineTest.createInstance());
        assertEquals(civilization1, civilization2);
    }

    @Test
    public void test_equals_negative() {
        @Jailbreak HumanCivilization civilization1 = this.createInstance();
        civilization1.developedAspects
                .insert(MineTest.createInstance());
        @Jailbreak HumanCivilization civilization2 = this.createInstance();
        civilization2.developedAspects
                .insert(OreVeinTest.createInstance());
        assertNotEquals(civilization1, civilization2);
    }

    @Test
    public void test_constructor_happyPath() {
        @Jailbreak HumanCivilization civilization = new HumanCivilizationSubclass();
        assertEquals(Multiset.emptyMultiset(), civilization.developedAspects);
    }
}
