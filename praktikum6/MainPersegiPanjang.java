//Perintah Inheritance praktikum 6

package Latihan06.sesi6.bin;

public class MainPersegiPanjang
{
public static void main(String[] Xx)
{
PersegiPanjang pp = new PersegiPanjang();
pp.setPanjang(10);
pp.setLebar(20);
System.out.println("Panjang : "+pp.getPanjang());
System.out.println("Lebar : "+pp.getLebar());
System.out.println("Luas : "+pp.getLuas());
}
}