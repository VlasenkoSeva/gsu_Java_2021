package repositories;

import Enums.PersonRole;
import Survey.Person;
import handlers.IPersonSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {

    private List<Person> persons = new ArrayList<>();

    public List<Person> findUsers() {
        return persons;
    }

    public boolean saveUser(Person person){
        if (person == null){
            return false;
        }
        if (person.getName() == null ||
                person.getName().isEmpty()){
            throw new IllegalArgumentException("Name not found");

        }
        return  persons.add(person);
        }

        public boolean removeUser(Person person){
          if( person == null){
              return false;
          }
           return  persons.remove(person);
        }

        public List<Person> findUsersByRole(PersonRole role){
            List <Person> filteredPersons = new LinkedList<>();
            for (Person person :  persons) {
                if (person.getRole().equals(role)) {
                    filteredPersons.add(person);
                }
            }
            return filteredPersons;
        }

    public List<Person> findUsers(IPersonSearch searchResponse){
        List <Person> filteredPersons = new LinkedList<>();
        persons.stream();
        for (Person person :  persons) {
            if (person.getRole().equals(searchResponse)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }
}


