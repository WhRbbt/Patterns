package CodeSmells.Lab4.RefactoredCode.Task2;

import java.util.ArrayList;
import java.util.List;

class FriendManager {
    private List<String> friends = new ArrayList<>();

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public void removeFriend(String friend) {
        friends.remove(friend);
    }

    public List<String> getFriends() {
        return friends;
    }
}
