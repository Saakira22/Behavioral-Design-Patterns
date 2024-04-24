import java.util.Stack;

class Caretaker {
    private final Stack<Memento> mementos = new Stack<>();

    public void addMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getMemento() {
        return mementos.pop();
    }
}
