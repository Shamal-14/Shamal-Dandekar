package loginValidation;

class Login {

    private String username = "admin";
    private String password = "12345";

    // Default Constructor
    public Login() {}

    // Parameterized Constructor (optional)
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Validate Username
    public void validateUsername(String enteredUsername) throws InvalidUsernameException {
        if (!enteredUsername.equals(username)) {
            throw new InvalidUsernameException("Invalid Username!");
        }
    }

    // Validate Password
    public void validatePassword(String enteredPassword) throws InvalidPasswordException {
        if (!enteredPassword.equals(password)) {
            throw new InvalidPasswordException("Incorrect Password!");
        }
    }
}
