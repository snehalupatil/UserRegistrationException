import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void validate_FirstName() throws UserRegistrationException {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateFirstName("Snehal");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_LastName() throws UserRegistrationException {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateLastName("Patil");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_Email() throws UserRegistrationException {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validateEmail("patilsnehal45@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_MobileNumber() throws UserRegistrationException {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validatePhoneNumber("91 9087654321");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void Validate_Password() throws UserRegistrationException {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.validatePassword("Passward#123");
        Assertions.assertEquals(true, result);
    }
}
