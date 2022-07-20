import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person person = new Person();

    @BeforeEach
    public void setup() {
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(2000);
        person.setPensioner(true);
        person.setAnotherCompanyOwner(true);
        person.setPublicServer(true);
    }
    @Test
    public void show_full_name(){
        Assertions.assertEquals(person.fullName(), "Paul McCartney");
    }
    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200f);
        Assertions.assertEquals(person.calculateYearlySalary(), 14400);
    }
    @Test
    public void person_is_MEI(){
        person.setPublicServer(false);
        person.setPensioner(false);
        person.setAnotherCompanyOwner(false);
        Assertions.assertTrue(person.isMEI());
    }
    @Test
    public void person_is_not_MEI(){

        Assertions.assertFalse(person.isMEI());
    }
}