package CodeSmells.Lab4.RefactoredCode.Task1;

class AdminCounter {
    private int adminCount = 0;

    public void checkAdmin(String username) {
        if (username.contains("admin")) {
            adminCount++;
        }
    }

    public int getCount() {
        return adminCount;
    }
}