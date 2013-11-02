//Perintah Control Flow / Struktur Kontrol
//Perintah kedua - contoh 02

package Latihan01.sesi1.bin;
import java.util.Random;
public class demolooping2
{
static boolean selesai = false;
public static void main(String[] Xx)
{
Integer faktor = 7;
System.out.println("Mencari Kelipatan " +faktor + " dengan while");
while(!selesai)
{
carikelipatan(faktor);
}
System.out.println("Selesai Mencari Kelipatan dengan While");
System.out.println();
System.out.println();
System.out.println("Mencari Kelipatan " +faktor + " dengan For");
for(selesai=false ; !selesai;)
{
carikelipatan(faktor);
}
System.out.println("Selesai Mencari Kelipatan dengan For");
}
public static void carikelipatan(Integer faktor)
{
Integer random = new Random().nextInt();
System.out.println("Bilangan Random : " +random );

if(random % faktor ==0)
{
System.out.println("Kelipatan " +faktor + " ditemukan yaitu : " +random);
selesai = true;
}
}
}