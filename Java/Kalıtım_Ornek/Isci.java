
package Kalıtım_Ornek;

public class Isci extends Personel{
    int overTimePayment;

    public Isci(){
        
    }
    
    public Isci(int netPayment, String firstName, String lastName, String company, int inputYear) {
        super(netPayment,firstName,lastName,company,inputYear);
    }

    public int getOverTimePayment() {
        return overTimePayment;
    }

    public void setOverTimePayment(int overTimePayment) {
        this.overTimePayment = overTimePayment;
    }
    
 
    public int overTimePayment(int time){
        if(time>=2 && time<5) this.overTimePayment = 250;
        else this.overTimePayment = 350;
                
        return this.overTimePayment;
    }

    
    @Override
    public String findPersonelTuru(){
        super.findPersonelTuru();
        String tür = "İşçi";
        return tür ;
    }
    
}
