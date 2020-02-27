package Civilization;

import Aspect.CivilizationAspect;
import com.google.common.collect.Multiset;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class HumanCivilization {

    @EqualsAndHashCode.Include
    private Multiset<CivilizationAspect> developedAspects;

    protected HumanCivilization() {
        this.developedAspects = Multiset.<CivilizationAspect>emptyMultiset();
    }
}
