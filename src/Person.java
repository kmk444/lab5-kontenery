import java.time.LocalDate;
import java.util.*;

public class Person implements Comparable<Person> {
    private String first_name;
    private String last_name;
    private LocalDate birthDate;

    private SortedSet<Person> children = new TreeSet<>(); // tworzymy new bo to nie jest inicjalizowane no i nie bierzemy go w konstruktorze

    public Person(String first_name, String last_name, LocalDate birthDate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthDate = birthDate;
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
        Collections.sort(list);
        return list;
    }
}
