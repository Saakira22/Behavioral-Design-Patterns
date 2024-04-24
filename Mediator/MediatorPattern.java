public class MediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new ConcreteUser(chatMediator, "AAA");
        User user2 = new ConcreteUser(chatMediator, "BBB");
        User user3 = new ConcreteUser(chatMediator, "CCC");
        User user4 = new ConcreteUser(chatMediator, "DDD");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi Everyone!");
    }
}
