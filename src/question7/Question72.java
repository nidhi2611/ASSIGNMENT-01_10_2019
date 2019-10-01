package question7;

public class Question72 {
    protected String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    Question72(String str) {
        string = str;
    }

    public int weight() {
        int k = 0;
        for (int i = 0; i < string.length(); i++) {
            k = k + (int) (string.charAt(i));
        }
        return k;
    }
}
