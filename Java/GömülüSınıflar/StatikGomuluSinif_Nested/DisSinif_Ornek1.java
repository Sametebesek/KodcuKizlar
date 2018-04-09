package StatikGomuluSinif_Nested;

public class DisSinif_Ornek1 {

    int degisken = 7;

    static class IcSinif {

        void BilgiMetodu() {
            System.out.println("Ben bir Statik Gömülü(Nested) Sınıfım.");
        }
    }

    public static void main(String[] args) {

        DisSinif_Ornek1.IcSinif b = new DisSinif_Ornek1.IcSinif();
        b.BilgiMetodu();
    }
}
