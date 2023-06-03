package implementasi.phone;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    String nama;    //untuk menyimpan nama kontak
    String nomor;   //untuk menyimpan nomor kontak
    List<Contact> listContacts = new ArrayList<>(); //menyimpan daftar list kontak yang sudah dibuat 

    public Contact(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
        listContacts.add(this);
    }

    String getNama()
    {
        return this.nama;
    }

    String getNomor()
    {
        return this.nomor;
    }

    public List<Contact> addContacts(Cellphone cp, String nama ,String nomor ){     //cp merupakan objek dari Cellphone
        //implementasi add contact
        if(cp.getStatusPhone() == 0){
            System.out.println("Ponsel mati. Tidak dapat menambahkan contact");
        }else{
            Contact contact = new Contact(nama, nomor);
            listContacts.add(contact);
        }
        
        return listContacts;
    }

    public void showContacts(Cellphone cp){
        if(cp.getStatusPhone() == 0){
            System.out.println("Ponsel mati. Tidak dapat menampilkan contact");
        }else{
            System.out.println("Daftar contact : ");
            //implementasi show contact
            for (int i = 0; i < listContacts.size(); i++) {
                System.out.println("Nama : " + listContacts.get(i).getNama());
                System.out.println("Nomor : " + listContacts.get(i).getNomor());
            }
        }
    }

    public void removeContacts(Cellphone cp, String nama){
        if(cp.getStatusPhone() == 0){
            System.out.println("Ponsel mati. Tidak dapat menghapus contact");
        }else{
            //implementasi remove contact
            for (int i = 0; i < listContacts.size(); i++) {
                if(listContacts.get(i).getNama().equals(nama)){
                    listContacts.remove(i);
                }
            }
        }
    }

    public void findContacts(Cellphone cp, String nama){
        if(cp.getStatusPhone() == 0){
            System.out.println("Ponsel mati. Tidak dapat mencari contact");
        }else{
            System.out.println("Hasil pencarian : ");
            //implementasi find contact
            for (int i = 0; i < listContacts.size(); i++) {
                if(listContacts.get(i).getNama().equals(nama)){
                    System.out.println("Nama : " + listContacts.get(i).getNama());
                    System.out.println("Nomor : " + listContacts.get(i).getNomor());
                }

            }
 
        }

    }


}