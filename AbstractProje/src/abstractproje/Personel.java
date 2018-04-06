
package abstractproje;

public abstract class Personel implements Ip_Method {

    String adi;
    String soyadi;
    int maaş;
    String unvan;
    String departman;
    int baslamaYili;

    @Override
    public String getAdi() {
        return adi;
    }

    @Override
    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String getSoyadi() {
        return soyadi;
    }

    @Override
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public int getMaaş() {
        return maaş;
    }

    @Override
    public void setMaaş(int maaş) {
        this.maaş = maaş;
    }

    @Override
    public String getUnvan() {
        return unvan;
    }

    @Override
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public String getDepartman() {
        return departman;
    }

    @Override
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public int getBaslamaYili() {
        return baslamaYili;
    }

    @Override
    public void setBaslamaYili(int baslamaYili) {

        if (baslamaYili < 1995) {
            System.out.println("Yanlış bir tarih girdiniz.");
        } else {
            this.baslamaYili = baslamaYili;
        }
    }

    @Override
    public String getAdiSoyadi() {
        return adi + " " + soyadi;
    }

    @Override
    public int getGuncelMaas(int ekUcret) {

        int toplamMaas = maaş + ekUcret;

        return toplamMaas;
    }
    
}
