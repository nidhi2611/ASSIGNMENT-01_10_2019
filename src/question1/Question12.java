package question1;

public class Question12 {
    protected String input_string;

    public Question12(String string) {
        input_string = string;

    }

    public String getInput_string() {
        return input_string;
    }

    public void setInput_string(String input_string) {
        this.input_string = input_string;
    }

    public void modify() {
        System.out.print("index:    ");
        for (int i = 0; i < input_string.length(); i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.print("chars:    ");
        for (int j = 0; j < input_string.length(); j++) {
            System.out.print("\t" + input_string.charAt(j));
        }
        System.out.println();

    }
}
