package repositories;

import Survey.Person;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<Person> persons = new ArrayList<>();

    public List<Person> findUsers(){
        return persons;
    }

    public boolean saveUser(Person person){
        if (person == null){
            return false;
        }
        if (person.getName() == null || person.getName().isEmpty()){
            return false;
        }
        return  persons.add(person);
        }
        public boolean removeUser(Person person){
          if( person == null){
              return false;
          }
           return  persons.remove(person);
        }
}


