//Perintah Inheritance
//Kelas Turunannya

package Latihan01.sesi4.bin;

public class TesKucingBesar
{
public static void main(String[] Xx)
{
Singa mySinga = new Singa("SIMBABA SURAI");
System.out.println("Singa merupakan " +Singa.nama);
mySinga.Makan();

Harimau myHarimau = new Harimau("Harimau Sumatera");
System.out.println("Harimau merupakan "+Harimau.nama);
myHarimau.Makan();
}
}
