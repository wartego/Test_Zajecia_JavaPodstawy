package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z2_String_Prefix_Suffix {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "";
        System.out.println("prefix Result: " + checkPrefix(input, prefix));
        System.out.println("suffix Result: " + checkSuffix(input, suffix));

    }

    private static boolean checkPrefix(String input, String prefix) {
        if (StringValidator.isValidString(input) && StringValidator.isValidString(prefix)) {
            return input.startsWith(prefix);
        }
        return false;

    }

    private static boolean checkSuffix(String input, String suffix) {
        if (StringValidator.isValidString(input) && StringValidator.isValidString(suffix) ) {
            return input.endsWith(suffix);
        }
        return false;
    }
}