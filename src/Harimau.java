//Perintah Inheritance
//Kelas Turunannya

package Latihan01.sesi4.bin;

class Harimau extends KucingBesar
{
//Konstruktor untuk class Harimau
public Harimau(String namaHarimau)
{
//Mengisi pengubah yang diwarisi oleh kelas abstract
Harimau.nama = namaHarimau;
}
//implementasi metode yang diwarisi dari kelas abstract
public void Makan()
{
System.out.println("Harimau makan daging dan minum susu");
System.out.println();
}
}