import java.util.HashMap;
import java.util.Map;

public class Family {
    Map<String, Person> familyMembers = new HashMap<>();

    public void add(Person... persons){ // te 3 kropki to lista ~ wariadyczna ~
        for(Person person : persons) {
            String key = person.getFirstName() + " " + person.getLastName();
            familyMembers.put(key, person);
        }
    }

    public Person get(String key){
        return familyMembers.get(key);
    }
}
