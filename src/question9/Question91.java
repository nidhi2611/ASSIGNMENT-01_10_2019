package question9;

public class Question91 {
    protected String string;

    Question91(String str) {
        this.string = str;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int absolute_weight() {
        int k = 0;
        int n = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                k = k + (int) string.charAt(i);
            }
            if (Character.isLowerCase(string.charAt(i))) {
                n = n + (int) string.charAt(i);
            }
        }
        return k - n;
    }


}


