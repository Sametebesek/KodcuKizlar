
package Kalıtım_Ornek;

public class Sozlesmeli extends Memur {

    int contractDuration;

    public Sozlesmeli(){
        
    }
    
    public Sozlesmeli(int netPayment, String firstName, String lastName, String company, int inputYear) {
        super(netPayment,firstName,lastName,company,inputYear);
    }

    
    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public String findPersonelTuru() {
        super.findPersonelTuru();
        String tür = "Sözleşmeli";
        return tür ;
    }
}
