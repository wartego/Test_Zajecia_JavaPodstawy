package javaPodstawyProgramowanie.ZadaniaWlasneTestowe;

public class IntToInteger {
    public static void main(String[] args) {
        long value = 10;
        int z = 10;
        String ne = String.valueOf(z);
        String valuetoBinary = Long.toBinaryString(value);
        System.out.println(valuetoBinary);
int x = Integer.parseInt(valuetoBinary,8);
        System.out.println(x);
        System.out.println("String \" "+ "\"");
    }
}
