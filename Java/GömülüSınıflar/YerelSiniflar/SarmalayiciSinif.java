package YerelSiniflar;

public class SarmalayiciSinif {

    public void ekranaYaz() {

        class YerelSinif {

            int a;

            public YerelSinif(int a) {
                this.a = a;
            }

        }
        YerelSinif yerelSinif = new YerelSinif(7);
        System.out.println(yerelSinif.a);
    }

    public static void main(String[] args) {
        SarmalayiciSinif sr = new SarmalayiciSinif();
        sr.ekranaYaz();
    }
}
