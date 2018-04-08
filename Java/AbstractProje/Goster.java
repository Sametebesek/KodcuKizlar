package abstractproje;

public class Goster {

    public void goster(Personel personel) {
            System.out.println("Adı-Soyadı : " + personel.getAdiSoyadi() + " \n"
                    + "Başlama Yılı : " + personel.getBaslamaYili() + " \n"
                            + "Unvan : " + personel.getUnvan() + " \n"
                                    + "Departman : " + personel.getDepartman() + " \n"
                                            + "Maaş : " + personel.getMaaş());

    }
}
