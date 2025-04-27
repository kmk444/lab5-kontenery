import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person parent1 = new Person("Jan","Kowalski", LocalDate.of(1945,3,26));
        Person child1_1 = new Person("Franek","Kowalski", LocalDate.of(1965,4,1));
        Person child1_2 = new Person("Wlodzislaw","Kowalski", LocalDate.of(1955,12,28));

        Person parent2 = new Person("Jan","Nowak", LocalDate.of(1946,3,26));
        Person child2_1 = new Person("Tomasz","Nowak", LocalDate.of(1970,6,26));
        Person child2_2 = new Person("Jan","Nowak", LocalDate.of(1960,2,21));
        parent1.adopt(child1_1);
        parent1.adopt(child1_2);

//        System.out.println(parent.getYoungestChild());
//        System.out.println(parent.getChildren());

        Family family = new Family();
        family.add(parent1, child1_1, child1_2, parent2, child2_1, child2_2);

        Person[] janowie = family.get("Jan Nowak");
        for(Person jan : janowie){
            System.out.println(jan.name() + " " + jan.getBirthDate());
        }
        System.out.println(janowie);
    }
}