package abstractproje;

public class AbstractProje {

    public static void main(String[] args) {

        Personel memur1 = new Memur();
        memur1.setAdi("Ahmet");
        memur1.setSoyadi("Ak");
        memur1.setBaslamaYili(2018);
        memur1.setDepartman("Nüfus Müdürlüğü");
        memur1.setUnvan("Nüfus Memuru");
        memur1.setMaaş(2000);

        Personel mühendis1 = new Mühendis();
        mühendis1.setAdi("Ali");
        mühendis1.setSoyadi("Yeşil");
        mühendis1.setBaslamaYili(2017);
        mühendis1.setDepartman("Yazılım Geliştirme");
        mühendis1.setUnvan("Yazılım Uzmanı");
        mühendis1.setMaaş(2000);
        ((Mühendis) mühendis1).setProjeSayisi(8);

        Personel isci1 = new İsci();
        isci1.setAdi("Veli");
        isci1.setSoyadi("Kara");
        isci1.setBaslamaYili(2005);
        isci1.setDepartman("Temizlik İşleri");
        isci1.setUnvan("Kat Görevlisi");
        isci1.setMaaş(2000);
        ((İsci) isci1).setMesaiSaati(5);
        ((İsci) isci1).setSaatBasiUcret(100);

        Personel akademisyen1 = new Akademisyen();
        akademisyen1.setAdi("Kaya");
        akademisyen1.setSoyadi("Beyaz");
        akademisyen1.setBaslamaYili(2015);
        akademisyen1.setDepartman("Mühendislik Fakültesi");
        akademisyen1.setUnvan("Öğretim Görevlisi");
        akademisyen1.setMaaş(2000);

        Personel personeller[] = new Personel[]{memur1, mühendis1, isci1, akademisyen1};
        Goster ekran = new Goster();
        for (Personel personeller1 : personeller) {
            if (personeller1.getClass() == Memur.class) {
                ekran.goster(personeller1);
                System.out.println("Görevli olunan işler : ");
                ((Memur) memur1).isler();
                System.out.println("--------------------------------------------");
            } else if (personeller1.getClass() == Akademisyen.class) {
                ekran.goster(personeller1);
                System.out.println("Verilen Dersler : ");
                ((Akademisyen) akademisyen1).verdigiDersler();
                System.out.println("--------------------------------------------");
            } else if (personeller1.getClass() == Mühendis.class) {
                ekran.goster(personeller1);
                System.out.println("Yapılan Proje Sayısı : " + ((Mühendis) mühendis1).getProjeSayisi());
                System.out.println("--------------------------------------------");
            } else {
                ekran.goster(personeller1);
                System.out.println("Mesai Ücreti : " + ((İsci) isci1).mesaiGelirHesapla());
                System.out.println("Mesai sonrası alınacak güncel maaş : " + memur1.getGuncelMaas(((İsci) isci1).mesaiGelirHesapla()));
                System.out.println("--------------------------------------------");
            }
        }

    }

}
