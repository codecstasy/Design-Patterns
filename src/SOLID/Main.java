package SOLID;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextDocument();
        SpellChecker spellChecker = new SpellCheckerImpl();

        TextEditorClient client = new TextEditorClient(textEditor, spellChecker);
        client.typeAndCheckSpelling("Hello, world!");
    }
}
