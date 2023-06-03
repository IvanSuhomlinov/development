package proj;
import java.util.*;

public class Person{
    Scanner input = new Scanner(System.in);
    private static int count = 0;
    private String lastName;
    private String PolisId;
    private final int personId;

    public Person(String lastName) {
        this.lastName = lastName;
        this.PolisId = null;
        this.personId = ++count;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPolis(String snilsId) {
        snilsId.matches("\\d{4}\\d{4}\\d{4}\\d{4}");
        this.PolisId = snilsId;
    }
    public String getPolis() {
        if (PolisId.matches("\\d{4}\\d{4}\\d{4}\\d{4}")) {
            this.PolisId = PolisId;
        } else {
            System.out.println("Ошибка: неверный номер СНИЛСа");
            input.next();
        }
        return this.PolisId;
    }


    public int getPersonId() {
        return this.personId;
    }


    public static List<Person> searchByLastName(List<Person> persons, String lastName) {
        List<Person> result = new ArrayList<>(); //?
        for (Person person : persons) {
            if (person.getLastName().equals(lastName)) {
                result.add(person);
            }
        }
        return result;
    }

    public static List<Person> searchPeopleNumberId(List<Person> persons, String personId) {
        List<Person> resultNumber = new ArrayList<>();
        for (Person person2 : persons) {
            if (personId.equals(personId)) {
                resultNumber.add(person2);
            }
        }
        return resultNumber;
    }
}
