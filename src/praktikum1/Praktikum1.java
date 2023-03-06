package praktikum1;

public class Praktikum1 {

    public static void main(String[] args) {
        //NOMOR 1
        System.out.println("Helo, nama saya adalah Selviana Dwi Aprianti");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program Java");
        System.out.println("============================");
        
        //NOMOR 2a
        float diameter = 10;
        float phi = 3.14f;
        float Keliling;
        System.out.println("Masukkan diameter: "+ diameter);
        System.out.println("Phi: "+phi);
        Keliling = phi*diameter;
        System.out.println("Keliling Lingkaran: "+Keliling);
        System.out.println("============================");

        //NOMOR 2b
        int alas = 6;
        int tinggi = 8;
        float luas;
        luas = (alas*tinggi)/2;
        System.out.println("Alas Segitiga: "+alas);
        System.out.println("Tinggi Segitiga: "+tinggi);
        System.out.println("Luas Segitiga: "+luas);
        System.out.println("============================");

        //NOMOR 2c
        float diameterTabung = 5;
        float tinggiTabung = 10;
        float jari = diameterTabung/2;
        float Volume;
        Volume = phi*jari*jari*tinggiTabung;
        System.out.println("Phi: "+phi);
        System.out.println("Jari-jari: "+jari);
        System.out.println("Tinggi Tabung: "+tinggiTabung);
        System.out.println("Volume Tabung: "+Volume);
    }
    
}
