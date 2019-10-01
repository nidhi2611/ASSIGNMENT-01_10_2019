package question3;

public class Question32 {
    protected String string;
    protected String vowel = "aeiouAEIOU";

    Question32(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void output() {
        for (int i = 0; i < vowel.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (vowel.charAt(i) == string.charAt(j)) {
                    string = string.replace(string.charAt(i), *);
                }
            }

        }

    }

}
