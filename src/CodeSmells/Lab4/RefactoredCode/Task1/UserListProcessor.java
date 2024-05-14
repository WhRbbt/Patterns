package CodeSmells.Lab4.RefactoredCode.Task1;

import java.util.ArrayList;

public class UserListProcessor {

    private ArrayList<String> usernames;

    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public void processUserList() {
        for (int i = 0; i < usernames.size(); i++) {
            processSingleUser(usernames.get(i));
        }
    }

    private void processSingleUser(String username) {
        System.out.println("Processing user: " + username);

        if (username.contains("admin")) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        AdminCounter adminCounter = new AdminCounter();
        for (String username : usernames) {
            adminCounter.checkAdmin(username);
        }
        return adminCounter.getCount();
    }

    public void addUser(User user) {
        // Adding user...
    }

    public void sendEmailToUser(EmailInfo emailInfo) {
        // Sending email...
    }
}
