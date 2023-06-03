package implementasi.phone;
import java.lang.Math;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int pulsa;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = 1;    //jika status 1 maka ponsel menyala
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;    //jika status 0 maka ponsel mati
        System.out.println("Ponsel mati");

    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        this.volume--;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getStatusPhone(){
        return this.status;
    }

    public int getPulsa(){
        return this.pulsa;
    }

    public void setPulsa(int pulsa){
        this.pulsa = pulsa;
    }

    public void topUpPulsa(int harga){
        if(getStatusPhone() == 0){  
            System.out.println("Ponsel mati. Tidak dapat melakukan top up");
        }else{
            //implenetasi top up pulsa
            if(harga > 0){
                this.pulsa += harga;
                System.out.println ("Top up berhasil, saldo pulsa anda sekarang " + this.pulsa + " rupiah");
            } else{
                System.out.println ( "Top up gagal");
            }
        }
    }

    public void getSisaPulsa(){
        if( getStatusPhone() == 0){
            System.out.println("Ponsel mati. Tidak dapat mengecek sisa pulsa");
        } else{
            System.out.println("Sisa pulsa anda adalah " + this.pulsa);
        }
    }

    


}