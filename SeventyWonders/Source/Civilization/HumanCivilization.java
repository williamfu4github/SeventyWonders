package Civilization;

import Aspect.CivilizationAspect;
import Ministry.GovernmentMinistry;
import com.google.common.collect.Multiset;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode
public abstract class HumanCivilization {

    @EqualsAndHashCode.Include
    private Multiset<CivilizationAspect> developedAspects;
    @EqualsAndHashCode.Include
    private Set<GovernmentMinistry> rulingGovernment;

    public Multiset<CivilizationAspect> developedAspects() {
        return this.developedAspects;
    }

    protected HumanCivilization() {
        this.developedAspects = Multiset.<CivilizationAspect>emptyMultiset();
        this.rulingGovernment = Set.<GovernmentMinistry>emptySet();
    }
}
