package StringSinifi;

/**
 *
 * @author tugba
 */
public class StringSinifi {

    public static void main(String[] args) {

        String metin = "Bu metin,String fonksiyonlarını deneyeceğimiz metnimizdir.";

        System.out.println("length() fonksiyonu");
        System.out.println("Metnin uzunluğu : " + metin.length());

        System.out.println("\n");

        System.out.println("charAt() fonksiyonu : ");
        System.out.println("7.indiste yer alan karakter : " + metin.charAt(7));

        System.out.println("\n");

        System.out.println("concat() fonksiyonu : ");
        System.out.println("Yeni bir metin ile birleştirme : " + metin.concat("Yeni eklenen metin"));

        System.out.println("\n");

        System.out.println("substring() fonksiyonu : ");
        System.out.println("7. ve 14.karakterler arası yer alan metin : " + metin.substring(7, 14));

        System.out.println("\n");

        System.out.println("trim fonksiyonu() : ");
        System.out.println("Boşlukları atılmış bir metin : " + metin.trim());

        System.out.println("\n");

        System.out.println("toLowerCase() fonksiyonu : ");
        System.out.println("Küçük harfli metin : " + metin.toLowerCase());

        System.out.println("\n");

        System.out.println("toUpperCase() fonksiyonu : ");
        System.out.println("Büyük harfli metin : " + metin.toUpperCase());

        System.out.println("\n");

        System.out.println("split() fonksiyonu : ");
        String ayrilanMetin[] = metin.split(" ");
        for (String a : ayrilanMetin) {
            System.out.println("İstenilen regex ifadesi ile parçalara bölünmüş metin : " + a);
        }

        System.out.println("\n");

        System.out.println("indexOf() fonksiyonu : ");
        System.out.println("-e- karakterinin index numarası : " + metin.indexOf("e"));

        System.out.println("\n");

        System.out.println("contains() fonksiyonu : ");
        System.out.println("-s- karakteri metnin içinde var mı? : " + metin.contains("s"));

        System.out.println("\n");

        System.out.println("replace() fonksiyonu : ");
        System.out.println("Karakterleri değiştirilmiş metin : " + metin.replace("e", "ü"));

        System.out.println("\n");

        System.out.println("Metnin içinde kaç adet boşluk olduğunu bulunuz.");
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            String harf = metin.substring(i, i + 1);
            if (harf.equals(" ")) {
                sayac++;
            }
        }
        System.out.println("Metindeki boşluk sayısı: " + sayac);

    }
}
