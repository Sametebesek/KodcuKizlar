
package abstractproje;

public class Akademisyen extends Personel {
    
    String verdigiDersler[] = {"Java","C","C++","Python","SQL","Proje Yönetimi"};
    
    public void verdigiDersler(){
        for (String verdigiDersler1 : verdigiDersler) {
            System.out.println(verdigiDersler1);
        }
    }

}
