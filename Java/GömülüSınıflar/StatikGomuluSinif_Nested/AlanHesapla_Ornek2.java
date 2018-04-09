package StatikGomuluSinif_Nested;

public class AlanHesapla_Ornek2 { // dış(kapsayan) sınıf

    public static class CemberAlanHesapla { // 1. statik iç sınıf

        private static double PI = 3.14;

        public double getAlan(double r) {
            return PI * r * r;
        }
    }

    public static class KareAlanHesapla { // 2. statik iç sınıf

        public int getAlan(int boy) {
            return boy * boy;
        }
    }

    public static void main(String[] args) {
        
        AlanHesapla_Ornek2.CemberAlanHesapla cember = new AlanHesapla_Ornek2.CemberAlanHesapla();
        double cemberAlan = cember.getAlan(3);

        System.out.println("Çember Alanı : " + cemberAlan);

        AlanHesapla_Ornek2.KareAlanHesapla kare = new AlanHesapla_Ornek2.KareAlanHesapla();
        int kareAlan = kare.getAlan(3);

        System.out.println("Kare Alanı : " + kareAlan);

    }
}
