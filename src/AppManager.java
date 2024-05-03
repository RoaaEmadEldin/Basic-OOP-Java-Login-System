public class AppManager{
    String getInstructorMenu(){
        StringBuilder menu = new StringBuilder();
        menu.append(" List of Students:\n");
        for (User user : Database.users){
            if (user.userType == 'S'){
                menu.append("- ");
                menu.append(user.username);
                menu.append('\n');
            }
        }

        return String.valueOf(menu);
    }

    String getStudentMenu(){
        StringBuilder menu = new StringBuilder();
        menu.append(" List of Courses:\n");
        for (String course: Database.courses){
            menu.append("- ");
            menu.append(course);
            menu.append('\n');
        }
        return String.valueOf(menu);
    }
}
