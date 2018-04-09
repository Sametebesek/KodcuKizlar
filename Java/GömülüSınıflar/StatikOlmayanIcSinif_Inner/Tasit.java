package StatikOlmayanIcSinif_Inner;

public class Tasit {

    private String arac_modelAdi;

    private int arac_modelYili;

    public Tasit(String ad, int soyad) {
        this.arac_modelAdi = ad;
        this.arac_modelYili = soyad;
    }

    public class TasitBilgisiYazdir {

        public void modelAdi() {
            System.out.println(arac_modelAdi);
        }

        public void modelYili() {
            System.out.println(arac_modelYili);
        }
    }

    public static void main(String[] args) {

        Tasit hesapBilgisi = new Tasit("Audi", 2006);
        Tasit.TasitBilgisiYazdir tasit = hesapBilgisi.new TasitBilgisiYazdir();
        tasit.modelAdi();
        tasit.modelYili();

    }

}
