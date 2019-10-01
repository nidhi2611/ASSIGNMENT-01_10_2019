package question5;

public class Question52 {
    protected String string;

    Question52(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String output() {
        return string.toUpperCase();
    }
}
