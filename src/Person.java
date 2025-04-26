import java.time.LocalDate;

public class Person {
    private String first_name, last_name;
    private LocalDate birthDate;

    public Person(String first_name, String last_name, LocalDate birthDate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthDate = birthDate;
    }
}
