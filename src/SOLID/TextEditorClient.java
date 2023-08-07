package SOLID;

// Open Closed Principle
public class TextEditorClient {
    private TextEditor textEditor;
    private SpellChecker spellChecker;

    public TextEditorClient(TextEditor textEditor, SpellChecker spellChecker) {
        this.textEditor = textEditor;
        this.spellChecker = spellChecker;
    }

    public void typeAndCheckSpelling(String text) {
        textEditor.type(text);
        spellChecker.checkSpelling(text);
    }
}
