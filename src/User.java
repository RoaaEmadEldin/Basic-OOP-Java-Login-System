public class User{
    public String username;
    public String password;
    public char userType; // 'I' for Instructor and 'S' for Student

    User (String username, String password, char userType){
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

}
