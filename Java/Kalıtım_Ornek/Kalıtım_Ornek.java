
package Kalıtım_Ornek;

public class Kalıtım_Ornek {

    public static void main(String[] args) {

        Isci k = new Isci();
        k.createPersonel("Tuğba", "Ay", "kodcukizlar.com", 2017, k.calculateSalary(2017));
        System.out.println("Çalışan Personel Türü : " + k.findPersonelTuru());
        System.out.println("Çalışma Süresi : " + k.calismaYiliHesapla(2017) + " yıl");
        System.out.println("Mesai ücreti : " + k.overTimePayment(5));
        System.out.println("Ay Sonu Alınacak Net Maaş : " +k.calculateOverTime(k.calculateSalary(2017), k.overTimePayment(5)) );

    }

}
