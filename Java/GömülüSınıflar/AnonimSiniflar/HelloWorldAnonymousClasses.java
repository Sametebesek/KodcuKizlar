
package AnonimSiniflar;

public class HelloWorldAnonymousClasses {

    interface MerhabaDünya {

        public void selam();
        public void birineSelamVer(String adi);
    }

    public void Merhaba() {

        class IngilizceSelamlasma implements MerhabaDünya {

            String name = "world";

            public void selam() {
                birineSelamVer("world");
            }

            public void birineSelamVer(String adi) {
                name = adi;
                System.out.println("Hello " + name);
            }

        }

        MerhabaDünya englishGreeting = new IngilizceSelamlasma();

        //anonim sınıf
        MerhabaDünya FransizcaSelamlasma = new MerhabaDünya() {
            
            String name = "tout le monde";

            public void selam() {
                birineSelamVer("tout le monde");
            }

            public void birineSelamVer(String adi) {
                name = adi;
                System.out.println("Salut " + name);
            }
        };

         //anonim sınıf
        MerhabaDünya IspanyolcaSelamlasma = new MerhabaDünya() {
            
            String name = "mundo";

            public void selam() {
                birineSelamVer("mundo");
            }

            public void birineSelamVer(String adi) {
                name = adi;
                System.out.println("Hola, " + name);
            }
        };
      
        englishGreeting.selam();
        FransizcaSelamlasma.birineSelamVer("Fred");
        IspanyolcaSelamlasma.selam();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp
                = new HelloWorldAnonymousClasses();
        myApp.Merhaba();
    }
}
