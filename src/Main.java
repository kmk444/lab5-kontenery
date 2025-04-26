import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Jan","Kowalski", LocalDate.of(1945,3,26)));
        people.add(new Person("Franek","Kowalski", LocalDate.of(1965,4,1)));

    }
}