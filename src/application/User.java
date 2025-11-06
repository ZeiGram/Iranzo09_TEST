package application;

public class User {
    private final String username;
    private final String emailAddress;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String userType; 

    public User(String username, String emailAddress, String firstName,
                String middleName, String lastName, String userType) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public String getUsername()     { return username; }
    public String getEmailAddress() { return emailAddress; }
    public String getFirstName()    { return firstName; }
    public String getMiddleName()   { return middleName; }
    public String getLastName()     { return lastName; }
    public String getUserType()     { return userType; }
}