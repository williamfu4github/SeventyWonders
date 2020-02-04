package Ministry;

import Civilization.HumanCivilization;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class MinistryOfNationalResource extends GovernmentMinistry {

    public MinistryOfNationalResource(HumanCivilization homeCivilization) {
        super.homeCivilization = homeCivilization;
    }
}
