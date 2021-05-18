import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{3,}";
    private static final String EMAIL = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$";
    private static final String PHONE_NUMBER = "^[0-9]{1,3} [0-9]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,}.*$";

    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            return pattern.matcher(firstName).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter Valid First Name:");
        }
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            return pattern.matcher(lastName).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Last Name:");
        }
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(EMAIL);
            return pattern.matcher(email).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Email:");
        }
    }

    public boolean validatePhoneNumber(String phone) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(PHONE_NUMBER);
            return pattern.matcher(phone).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Phone Number:");
        }
    }

    public boolean validatePassword(String Password) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(PASSWORD);
            return pattern.matcher(Password).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Enter valid Password:");
        }
    }

}
