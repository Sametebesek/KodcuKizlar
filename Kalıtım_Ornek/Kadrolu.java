
package Kalıtım_Ornek;


public class Kadrolu extends Memur {

    int degree;

    public Kadrolu(){
        
    }
    
    public Kadrolu(int netPayment, String firstName, String lastName, String company, int inputYear) {
        super(netPayment,firstName,lastName,company,inputYear);
    }
    
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String findPersonelTuru() {
        super.findPersonelTuru();
        String tür = "Kadrolu";
        return tür ;
    }
}
