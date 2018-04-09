package StatikOlmayanIcSinif_Inner;

public class DisSinif {

    private String outer = "Ben bir dış sınıf değişkeniyim."; //Dış sınıf instance değişkeni
    IcSinif innerClass = new IcSinif();

    void getDis() {
        System.out.println(outer);
    }

    void getIc() {
        System.out.println(innerClass.inner);
    }

    class IcSinif {

        private String inner = "Ben bir iç sınıf değişkeniyim."; //İç Sınıf instance değişkeni

        void getIc() {
            System.out.println(inner);
        }

        void getDis() {
            System.out.println(DisSinif.this.outer);
        }
    }

    public static void main(String[] args) {

        DisSinif disSinifObjesi = new DisSinif();
        DisSinif.IcSinif icSinifObjesi = disSinifObjesi.new IcSinif();
        // new DisSinif().new IcSinif (); diyerek de çağrılabilir.

        disSinifObjesi.getDis(); // Dış Sınıf değişkeni 

        disSinifObjesi.getIc(); // İç Sınıf değişkeni 

        icSinifObjesi.getIc(); // İç Sınıf değişkeni 

        icSinifObjesi.getDis(); // Dış Sınıf değişkeni 
    }
}
