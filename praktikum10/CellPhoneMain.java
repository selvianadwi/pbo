package implementasi.phone;

public class CellPhoneMain {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.volumeUp();
        cp.topUpPulsa(10000);
        cp.getSisaPulsa();
        cp.topUpPulsa(2000);
        cp.getSisaPulsa();

        Contact contact = new Contact("Selvi", "08123456789");
        contact.addContacts(cp, "Test", "082111111111");
        contact.showContacts(cp);
        contact.findContacts(cp, "Test");
        //cp.powerOff();
        contact.removeContacts(cp, "Test");
        contact.showContacts(cp);
        cp.powerOff();
    


    }
}
