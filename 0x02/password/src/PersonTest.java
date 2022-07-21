import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PersonTest {

    Person person;

    @BeforeAll
    public void setup() {
    person = new Person();
    }

    @ParameterizedTest(name = "checkUser, deve ser válido")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String userName){
        Assertions.assertTrue(person.checkUser(userName));
    }
    @ParameterizedTest(name = "checkUser, não deve ser válido")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String userName){
        Assertions.assertFalse(person.checkUser(userName));
    }
    @ParameterizedTest(name = "checkPassword, não deve ser válido")
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }
    @ParameterizedTest(name = "checkPassword, não deve ser válido")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }
    @ParameterizedTest(name = "checkPassword, não deve ser válido")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest(name = "checkPassword, deve ser válido")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String password){
        Assertions.assertTrue(person.checkPassword(password));
    }
}