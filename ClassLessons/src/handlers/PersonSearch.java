package handlers;

import Enums.PersonRole;
import Survey.Person;

public class PersonSearch implements IPersonSearch{
    @Override
    public boolean existByField(Person person) {
        return person.getRole().equals(PersonRole.ADMIN);
    }
}
