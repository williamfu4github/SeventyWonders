package Ministry;

import Civilization.HumanCivilization;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class GovernmentMinistry {

    @EqualsAndHashCode.Exclude
    protected HumanCivilization homeCivilization;

    protected GovernmentMinistry() {
        this.homeCivilization = null;
    }
}
