//Perintah Class & Object - Dosen
package Latihan01.sesi1.bin;
public class Dosen
{
String nama;
String email;
//begitu kita mendefinisikan constructor
//java tidak akan membuatkan default constructor

public Dosen(String nama, String email)
{
this.nama = nama;
this.email = email;
}

public Dosen() {}

//method
public void info()
{
System.out.println("Nama Dosen : " +nama);
System.out.println("Email : " +email);
System.out.println("");
System.out.println("");
}
}
