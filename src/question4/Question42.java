package question4;

public class Question42 {
    protected String string;
    protected String vowel = "aeiou";

    Question42(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void output() {
        int counter = 0;
        for (int i = 0; i < vowel.length(); i++) {
            counter = 0;
            for (int j = 0; j < string.length(); j++) {
                if (vowel.charAt(i) == string.charAt(j)) {
                    counter = counter + 1;
                    if (counter % 3 == 0) {
                        string = string.replace(string.charAt(j), '!');
                    } else if (counter % 2 == 0) {
                        string = string.replace(string.charAt(j), '^');
                    } else {
                        string = string.replace(string.charAt(j), '*');
                    }
                }
            }


        }
        System.out.print(string);
    }
}
