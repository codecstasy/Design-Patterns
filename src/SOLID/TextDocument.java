package SOLID;

public class TextDocument implements TextEditor {
    private Document document;

    public TextDocument() {
        this.document = new Document();
    }

    @Override
    public void type(String text) {
        document.setContent(text);
    }

    @Override
    public String getText() {
        return document.getContent();
    }
}
