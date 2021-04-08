package Services;

import Enums.PersonRole;
import Services.Interface.IUserService;
import Survey.Person;

import java.util.List;

public class UserService implements IUserService {



    @Override
    public List<Person> findAllUsers() {
        return null;
    }

    @Override
    public List<Person> findUserByRole(PersonRole role) {
        return null;
    }

    @Override
    public List<Person> findUserById(int id) {
        return null;
    }

    @Override
    public List<Integer> findIdsByRole(PersonRole role) {
        return null;
    }

    @Override
    public boolean saveUser(Person person) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }

    @Override
    public boolean removeUser(Person person) {
        return false;
    }

}
