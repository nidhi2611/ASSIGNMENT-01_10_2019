package question2;

public class Question22 {
    protected String string;
    protected int n;

    Question22(String string, int n) {
        this.string = string;
        this.n = n;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String output() {
        return string.substring(n);
    }
}
