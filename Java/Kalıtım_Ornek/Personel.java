package Kalıtım_Ornek;

public class Personel {

    int netPayment;
    String firstName;
    String lastName;
    String company;
    int inputYear;

    int sayac = 1;

    public void createPersonel(String firstName, String lastName, String company, int inputYear, int netPayment) {
        System.out.println(sayac + "\n"
                + " Adı : " + firstName + " \n"
                + " Soyadı : " + lastName + " \n"
                + " Çalıştığı Şirket : " + company + " \n"
                + " Giriş Yılı : " + inputYear + " \n"
                + " netPayment : " + netPayment + " \n");

        sayac++;
    }

    public int calculateSalary(int inputYear) {

        int deger = calismaYiliHesapla(inputYear);
        if (deger <= 0) {
            this.netPayment = 1500;
        } else if (deger > 0 && deger <= 3) {
            this.netPayment = 3000;
        } else {
            this.netPayment = 4500;
        }

        return this.netPayment;
    }

    public int calismaYiliHesapla(int inputYear) {
        int now = 2018;
        int hesapla = 2018 - inputYear;

        return hesapla;
    }

    public int calculateOverTime(int netSalary, int overTimeSalary) {

        int overSalary = netSalary + overTimeSalary;

        return overSalary;
    }

    public String findPersonelTuru() {
        String tür = " ";
        return tür + " : ";
    }

    public Personel() {
    }

    public Personel(int netPayment, String firstName, String lastName, String company, int inputYear) {
        this.netPayment = netPayment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.inputYear = inputYear;
    }

    public int getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(int netPayment) {
        this.netPayment = netPayment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getInputYear() {
        return inputYear;
    }

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

}
