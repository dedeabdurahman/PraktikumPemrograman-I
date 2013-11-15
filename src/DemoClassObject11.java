//Perintah Class & Object - DemoClassObject1
package Latihan01.sesi1.bin;
public class DemoClassObject11
{
public static void main(String[] Xx)
{
mahasiswa12.jumlah = 0;
//mahasiswa.nim = "999"; //error, instance variabel harus ada objectnya dulu
System.out.println("Jumlah Mahasiswa : " +mahasiswa12.jumlah);

mahasiswa12 m1 = new mahasiswa12();
m1.nim = "123";
m1.nama = "Dede";
m1.jumlah = 1;

mahasiswa12 m2 = new mahasiswa12();
m2.nim = "234";
m2.nama = "Syahid";
m2.jumlah = 2;

tampilkanmahasiswa(m1);
tampilkanmahasiswa(m2);
System.out.println("Jumlah Mahasiswa : " +mahasiswa12.jumlah);
}


public static void tampilkanmahasiswa(mahasiswa12 m)
{
System.out.println("Nim    : " +m.nim);
System.out.println("Nama   : " +m.nama);
System.out.println("Jumlah : " +m.jumlah);
System.out.println("");
System.out.println("");
}
}

