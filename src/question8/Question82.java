package question8;

public class Question82 {
    protected String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    Question82(String string) {
        this.string = string;
    }

    public int upper_case_weight() {
        int k = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                k = k + (int) string.charAt(i);
            }

        }
        return k;
    }

}
