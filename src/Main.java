import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppManager appManager = new AppManager();
        System.out.println("Welcome to the Course Center Application!");
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();
        boolean validCredentials = false;
        while (!validCredentials){
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User validUser = auth.getValidUser(username, password, Database.users);

            if (validUser != null){
                validCredentials = true;
                System.out.print("Login Successful.");
                if (validUser.userType == 'I'){
                    System.out.print(appManager.getInstructorMenu());
                }
                else if (validUser.userType == 'S'){
                    System.out.println(appManager.getStudentMenu());
                }
            }
            else{
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}