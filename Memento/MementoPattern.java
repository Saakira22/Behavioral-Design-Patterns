public class MementoPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setContent("First content");
        caretaker.addMemento(textEditor.save());

        textEditor.setContent("Second content");
        caretaker.addMemento(textEditor.save());

        textEditor.setContent("Third content");
        System.out.println("Current Content: " + textEditor.getContent());

        textEditor.restore(caretaker.getMemento());
        System.out.println("Restored Content: " + textEditor.getContent());

        textEditor.restore(caretaker.getMemento());
        System.out.println("Restored Content: " + textEditor.getContent());
    }
}
