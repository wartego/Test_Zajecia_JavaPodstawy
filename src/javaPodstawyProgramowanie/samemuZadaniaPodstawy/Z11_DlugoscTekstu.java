package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.*;

public class Z11_DlugoscTekstu {
    public static void main(String[] args) {
        int i = 0;
        // ArrayList<Integer> listaZnakow = new ArrayList<Integer>();
        ArrayList<String> listaString = new ArrayList<String>();
        listaString.add("");
        String text = "";
        String stop = "Starczy";
        String poprzedni_text = "";
        do {
            System.out.println("Wprowadz text: ");
            Scanner input = new Scanner(System.in);
            text = input.nextLine();
            if (text.equals(stop)) {
                break;
            }else{
                int wartosc1 = listaString.get(0).length();
                if (text.length() > wartosc1) {
                    listaString.add(0, text);
                } else {
                    listaString.add(text.trim());
                }
            }
        }while (true);
       // } while (!text.equals(stop));

        //Collections.sort(listaString.size());
        System.out.println("Lista wyrazen to : " + listaString);
        System.out.println("Najdluzszy tekst to : " + listaString.get(0));
        for (i=1 ; i <listaString.size();i++){
            if (listaString.get(0).length() == listaString.get(i).length()){
                System.out.println("Najdluzszy rowniez to : " + listaString.get(i));
            }
        }

//            while (listaString.get(i).length() != listaString.get(i+1).length()){
//                System.out.println("Najdluzszy tekst to : " + listaString.get(i));
//                i++;
//            }
            System.out.println("KONIEC");
        }
    }

