import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String first_name;
    private String last_name;
    private LocalDate birthDate;

    private Set<Person> children = new HashSet<>(); // tworzymy new bo to nie jest inicjalizowane no i nie bierzemy go w konstruktorze

    public Person(String first_name, String last_name, LocalDate birthDate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthDate = birthDate;
    }

    public boolean adopt(Person child){
        return children.add(child); // .add() zwraca true jesli element byl nowy
    }

}
