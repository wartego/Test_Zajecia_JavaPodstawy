package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z4_StringChangeChar {

    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String text = "Ala ma, kota. a kot, ma Ale";
        System.out.println(replaceDotsAndCommas(text));
    }
    private static String replaceDotsAndCommas (String text) {
        if (StringValidator.isValidString(text)) {
//            return text
//                    .replace(".","-STOP-")
//                    .replace(",","-STOP-");

            return text.replaceAll(REGEX,REPLACEMENT);
        }
        return text;
    }
}
