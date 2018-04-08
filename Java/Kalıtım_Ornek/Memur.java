package Kalıtım_Ornek;

public class Memur extends Personel {

    int discipline;

    public Memur(){
        
    }
    
    public Memur(int netPayment, String firstName, String lastName, String company, int inputYear) {
        super(netPayment,firstName,lastName,company,inputYear);
    }

    
    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    @Override
    public String findPersonelTuru() {
        super.findPersonelTuru();
        String tür = "Memur";
        return tür;
    }
}
