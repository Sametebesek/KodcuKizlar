package Gölgeleme;

public class Gölgeleme {

    public int x = 0;

    class IlkSeviye {

        public int x = 1;

        void sayiTesti(int x) {
            System.out.println("x = " + x); // main değeri
            System.out.println("this.x = " + this.x); // iç sınıf değeri
            System.out.println("Gölgeleme.this.x = " + Gölgeleme.this.x); // dış sınıf değeri
        }
    }

    public static void main(String... args) {

        Gölgeleme.IlkSeviye test = new Gölgeleme().new IlkSeviye();
        test.sayiTesti(23);
        
        /*
        İlk olarak 23 değerini yazar.
        İkinci olarak 1 değerini yazar.
        Üçüncü olarak 0 değerini yazar.
            Gölgelemenin mantığında alt seviyedeki tanımlama,üst sınıftaki tanımlamayı gölgeler.
            Burada da en alt seviyede main seviyesinde tanımladığımız 23 değeri diğer üst sınıflardaki değerleri geride bırakır.
        */
    }
}
