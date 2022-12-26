package Core.Conversor.Models;

public class TaggedText {

    private String text;
    private Tags tag;
    private int indentationLevel;
    private String property;

    public TaggedText(String text, Tags tag, int indentationLevel, String property) {
        this.text = text;
        this.tag = tag;
        this.indentationLevel = indentationLevel;
        this.property = property;
    }

    public TaggedText(String text, Tags tag, int indentationLevel) {
        this.text = text;
        this.tag = tag;
        this.indentationLevel = indentationLevel;
        this.property = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Tags getTag() {
        return tag;
    }

    public void setTag(Tags tag) {
        this.tag = tag;
    }

    public int getIndentationLevel() {
        return indentationLevel;
    }

    public void setIndentationLevel(int indentationLevel) {
        this.indentationLevel = indentationLevel;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
