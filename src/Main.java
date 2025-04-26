import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person parent = new Person("Jan","Kowalski", LocalDate.of(1945,3,26));
        Person child1 = new Person("Franek","Kowalski", LocalDate.of(1965,4,1));
        Person child2 = new Person("Wlodzislaw","Kowalski", LocalDate.of(1955,12,28));

        parent.adopt(child1);
        parent.adopt(child2);

        System.out.println(parent.getYoungestChild());
        System.out.println(parent.getChildren());

        Family family = new Family();
        family.add(parent);
        family.add(child1);
        family.add(child2);
        System.out.println(parent.getFirstName());;
        System.out.println(family.get("Jan Kowalski").getFirstName());
    }
}