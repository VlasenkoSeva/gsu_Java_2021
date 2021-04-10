import Enums.PersonRole;
import Services.UserService;
import Survey.Admin;
import Survey.Person;
import handlers.IPersonSearch;
import repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        boolean response = userRepository.saveUser(new Admin("Nastya"));

        class SearchName implements IPersonSearch{
            @Override
            public boolean existByField(Person person) {
                return person.getName().contentEquals("Nastya");
            }
        }

        /*new IPersonSearch() {
            @Override
            public boolean existByField(Person person) {
                return person.getName().contentEquals("Nastya");
            }
        }*/

      /*  SearchName searchName = new SearchName();
        *//* анонимный класc*//*
        System.out.println(userRepository.findUsers((person) -> person.getName().contentEquals("Nastya"))); // лямбда
*/

        List <Person> users = userRepository.findUsers();
        List <Person> responses = users.stream().filter((el)-> el.getName().equals("Nastya")).collect(Collectors.toList());
        System.out.println(responses);
    }
}
