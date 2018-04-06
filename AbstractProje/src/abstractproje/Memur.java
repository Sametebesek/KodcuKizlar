
package abstractproje;

public class Memur extends Personel {

    static String sorumluOlduguIsler[] = {"Nüfus Kağıdı Kontrolü", "İkametgah Kontrolü" , "Adli Sicil Kaydı Kontrolü"};
    
    public void isler(){
        for (String sorumluOlduguIsler1 : sorumluOlduguIsler) {
            System.out.println(sorumluOlduguIsler1);
        }
        
    }
}
