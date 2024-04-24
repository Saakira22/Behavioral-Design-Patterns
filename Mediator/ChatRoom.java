import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Do not broadcast the message to the sender
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
