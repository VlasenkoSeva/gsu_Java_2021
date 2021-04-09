package Services.Interface;

import Enums.PersonRole;
import Survey.Person;

import java.util.List;

public interface IUserService {

    List<Person> findAllUsers();
    List<Person> findUserByRole(PersonRole role);
    List<Person> findUserById(int id);
    List<Integer> findIdsByRole(PersonRole role);
    boolean saveUser(Person person);
    boolean removeUser(int id);
    boolean removeUser(Person person);



}
