package kodcukizlar;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tugba
 */
public class RegexDeneme {

    public static void main(String[] args) {

        System.out.println("----------------------------Örnek 1----------------------------");

        String metin1 = "Bu bir deneme metnidir. Deneme metinlerinin içerisinde yer alan kelimeler ile arama yapacağız.Aranılacak desenimiz : içerisinde kelimesidir.";

        /*
            \\bARANANDESEN\\b ifadesi ile aranılacak desenin öncesinde ve sonrasında da karakterler olabileceğini belirtiriz.
         */
        Pattern p = Pattern.compile("\\biçerisinde\\b");//. represents single character  
        Matcher m = p.matcher(metin1);

        int sayac = 0;

        while (m.find()) { // Matcher class'ı eşleşme bulana kadar döner.
            sayac++;       // eşleşmenin kaç adet olduğunu bulmak için sayaç tuttuk.
            System.out.println("Eşleşme sayısı : " + sayac);
            System.out.println("start(): " + m.start()); //eşleşmenin başlangıç noktasını alır.
            System.out.println("end(): " + m.end()); //eşleşmenin bitiş noktasını alır.
        }

        System.out.println("----------------------------Örnek 2----------------------------");

        String metin2 = "b2 kodlu ürün mevcuttur.";

        Pattern kalip = Pattern.compile("[a-zA-Z][0-9]");
        Matcher eslesme = kalip.matcher(metin2);

        if (eslesme.find() == true) {
            System.out.println(metin2 + " ---> metninin deseni : " + kalip + "\nBu metin ve desen birbirine uyuşur.");
        } else {
            System.out.println(metin2 + " metninin deseni : " + kalip + "\n Bu metin ve desen birbirine uyuşmaz.");
        }

        System.out.println("----------------------------Örnek 3----------------------------");

        String iDesen = "([aA]hmet){3}";  // ahmet ya da Ahmet kelimesinin üç adet arka arkaya geçtiği metin deseni
        String iString = "aAhmetAhmetahmet";
        Pattern pattern = Pattern.compile(iDesen);
        Matcher matcher = pattern.matcher(iString);
        boolean found = false;
        int counter = 0;
        while (matcher.find()) {
            System.out.format(
                    "Bulunan metin : " + matcher.group() + " \n "
                    + "başlangıç : " + matcher.start() + " \n "
                    + "bitiş :" + matcher.end() + " \n ");

            found = true;
            counter++;
        }

        System.out.println("Bulunan adet: " + counter);
        if (!found) {
            System.out.format("Bulamadı.%n");
        }

        System.out.println("----------------------------Örnek 4----------------------------");

        String input = "I have a cat, but I like my dog better.";
        
        Pattern pDesen = Pattern.compile("(mouse|cat|dog|wolf|bear|human)"); // ya da 
        Matcher mEslesme = pDesen.matcher(input);

        while (mEslesme.find()) {
            System.out.println("Found a " + mEslesme.group() + ".");
        }
    }
}
