//Perintah Inheritance
//Kelas Turunannya

package Latihan01.sesi4.bin;

class Singa extends KucingBesar
{
//Konstruktor untuk class Singa
public Singa(String namaSinga)
{
//Mengisi pengubah yang diwarisi oleh kelas abstract
Singa.nama = namaSinga;
}
//implementasi metode yang diwarisi dari kelas abstract
public void Makan()
{
System.out.println("Singa makan daging");
System.out.println();
}
}