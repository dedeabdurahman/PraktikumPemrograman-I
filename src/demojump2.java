//Perintah control Flow / Struktur Control
// Perintah kelima - contoh 05
package Latihan01.sesi1.bin;
import java.util.Random;

public class demojump2
{
public static void main(String[] Xx)
{
Integer faktor = 7;
Integer jumlahfaktordiinginkan = 4;
Integer batasatas = 1000000;

System.out.println("Mencari Kelipatan " +faktor+" dengan break dan Continue");
Integer jumlahfaktorditemukan = 0;
while(true)
{
Integer random = new Random().nextInt();
System.out.println("Bilangan Random : " +random);

if(random>batasatas)
{
System.out.println("Melewati batas atas, langsung selesai");
return;
}
if(random%faktor == 0)
{
System.out.println("Kelipatan " +faktor+ " ditemukan, yaitu : " +random);
jumlahfaktorditemukan++;
if(jumlahfaktorditemukan <jumlahfaktordiinginkan)
{
System.out.println("Baru menemukan "+jumlahfaktorditemukan+ " faktor");
System.out.println("dari " +jumlahfaktordiinginkan+ " yang diminta, lanjut lagi");
continue;
}
else
{
System.out.println("Sudah menemukan "+jumlahfaktordiinginkan+ " ,Selesai Looping");
break;
}
}
}
System.out.println("Selesai Mencari Kelipatan");
}
}

