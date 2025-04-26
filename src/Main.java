import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Jan","Kowalski", LocalDate.of(1945,3,26));
        Person person2 = new Person("Franek","Kowalski", LocalDate.of(1965,4,1));
        people.add(person1);
        people.add(person2);


        System.out.println(person1.adopt(person2));
        System.out.println(person1.adopt(person2));

    }
}