package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z15_PorownanieTablic {
    public static void main(String[] args) {
        String[] firstDigit = {"Ala" , "ma" , "kota"};
        String[] secondDigit = {"Ala" , "ma" , "kota"};
        System.out.println(areEqual(firstDigit,secondDigit));
    }
    private static boolean areEqual(String[] firstArray,String[] secondArray){
        // porowanie tablic
        // 1. czy rozmiar tablic jest taki sam

        if (firstArray.length == secondArray.length){
            for (int i = 0 ; i < firstArray.length; i++){
                String elementFromFirstArray = firstArray[i];
                String elementFromSecondArray = secondArray[i];

                if(elementFromFirstArray == null && elementFromSecondArray == null){
                    continue;
                }
             //   if(!elementFromFirstArray.equals(elementFromSecondArray)){
                if(elementFromFirstArray == null || (!elementFromFirstArray.equals(elementFromSecondArray))){
                    return false;
                }
            }
            return true;

        }
        return false;
    }
}
