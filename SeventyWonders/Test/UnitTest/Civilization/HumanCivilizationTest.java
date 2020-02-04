package UnitTest.Civilization;

import Aspect.CivilizationAspect;
import Civilization.HumanCivilization;
import TesterBase.UnitTest.SingleClassUnitTest;
import com.google.common.collect.Multiset;
import manifold.ext.api.Jailbreak;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static Utility.TestInstanceFactory.MineTest;
import static Utility.TestInstanceFactory.MinistryOfNationalResourceTest;
import static Utility.TestInstanceFactory.OreVeinTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public final class HumanCivilizationTest implements SingleClassUnitTest<HumanCivilization> {

    private final class HumanCivilizationSubclass extends HumanCivilization {
    }

    @Override
    public void clearInstance(@Jailbreak HumanCivilization instance) {
        instance.developedAspects.clear();
        instance.rulingGovernment.clear();
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
        civilization1.rulingGovernment
                .insert(MinistryOfNationalResourceTest.createInstance());
        @Jailbreak HumanCivilization civilization2 = this.createInstance();
        civilization2.developedAspects
                .insert(MineTest.createInstance());
        civilization2.rulingGovernment
                .insert(MinistryOfNationalResourceTest.createInstance());
        assertEquals(civilization1, civilization2);
    }

    @Test
    public void test_equals_negative_developedAspects() {
        @Jailbreak HumanCivilization civilization1 = this.createInstance();
        civilization1.developedAspects
                .insert(MineTest.createInstance());
        @Jailbreak HumanCivilization civilization2 = this.createInstance();
        civilization2.developedAspects
                .insert(OreVeinTest.createInstance());
        assertNotEquals(civilization1, civilization2);
    }

    @Test
    public void test_equals_negative_rulingGovernment() {
        // TODO add two different GovernmentMinistry
    }

    @Test
    public void test_developedAspects_happyPath() {
        @Jailbreak HumanCivilization civilization = this.createInstance();
        civilization.developedAspects = Multiset.<CivilizationAspect>of(MineTest.createInstance());
        assertEquals(Multiset.of(MineTest.createInstance()), civilization.developedAspects());
    }

    @Test
    public void test_constructor_happyPath() {
        @Jailbreak HumanCivilization civilization = new HumanCivilizationSubclass();
        assertEquals(Multiset.emptyMultiset(), civilization.developedAspects);
        assertEquals(Set.emptySet(), civilization.rulingGovernment);
    }

    // invariant: each GovernmentMinistry in field rulingGovernment has its unique type
    @Test
    public void test_invariant_governmentMinistryUniqueType_happyPath() {
        @Jailbreak HumanCivilization civilization = new HumanCivilizationSubclass();
        Integer uniqueTypeCount = civilization.rulingGovernment.stream()
                .map(ministry -> ministry.getClass())
                .toSet()
                .size();
        assertEquals(uniqueTypeCount, civilization.rulingGovernment.size());
    }
}
