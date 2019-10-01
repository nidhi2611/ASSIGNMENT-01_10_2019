package question10;

public class Question102 {
    protected String string;
    protected char ch;
    public String getString() {
        return string;
    }

    Question102(String string, char ch) {
        this.string = string;
        this.ch = ch;
    }

    public void setString(String string) {
        this.string = string;
    }

    public char getCh() {
        return ch;
    }

    public void setCh() {
        this.ch = ch;
    }

    public int index() {
        return string.indexOf(ch);
    }
}
