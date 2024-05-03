import java.util.Objects;

public class Authentication{
    // Login Function that returns a User if successful login, else returns null
    public User getValidUser(String username, String password, User[] users){
        for (User user: users){
            if (user.username.equals(username) && user.password.equals(password)){
                return user;
            }
        }
        return null;
    }

}
