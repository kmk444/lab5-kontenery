import java.time.LocalDate;
import java.util.*;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private SortedSet<Person> children = new TreeSet<>(); // tworzymy new bo to nie jest inicjalizowane no i nie bierzemy go w konstruktorze

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Person o) {
        return this.birthDate.compareTo(o.birthDate);
    }

    public boolean adopt(Person child){
        return children.add(child); // .add() zwraca true jesli element byl nowy
    }


    public Person getYoungestChild(){
        return children.last(); // da sie tego uzyc bo uzylismy Comparable i zmienilismy na SortedSet
    }

    public List<Person> getChildren(){
        List<Person> list = new ArrayList<>(children);
        Collections.sort(list); // sortowanie listy
        return list;
    }

    public String name(){ // najpierw to bylo w Family tylko jako key ale zmienilem bo sie przydaje do wyswietlenia
        return this.getFirstName() + " " + this.getLastName();
    }
}
