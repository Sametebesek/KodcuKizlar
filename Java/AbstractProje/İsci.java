
package abstractproje;

public class İsci extends Personel {

    int mesaiSaati;
    int saatBasiUcret;

    public int getMesaiSaati() {
        return mesaiSaati;
    }

    public void setMesaiSaati(int mesaiSaati) {
        this.mesaiSaati = mesaiSaati;
    }

    public int getSaatBasiUcret() {
        return saatBasiUcret;
    }

    public void setSaatBasiUcret(int saatBasiUcret) {
        this.saatBasiUcret = saatBasiUcret;
    }

    public int mesaiGelirHesapla() {

        int a = getMesaiSaati();
        int b = getSaatBasiUcret();

        int mesaiGelir = a * b;

        return mesaiGelir;
    }

}
