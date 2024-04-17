package Model;

public class User {

    private int ID;
    private String username;
    private String password;
    private String emailAddress;
    private String homeAddress;
    private String firstName;
    private String lastName;
    private UserType userType;

    public User(int ID, String username, String password, String emailAddress, String homeAddress, String firstName, String lastName, UserType userType) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;

    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public UserType getUserType() {
        return userType;
    }
}
