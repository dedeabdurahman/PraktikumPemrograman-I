//Perintah Control Flow / Struktur Kontrol
//Perintah kedua - contoh 02

package Latihan01.sesi1.bin;
public class demolooping
{
public static void main (String [] Xx )
{
String[][] daftarnilai = new String[][]
{
new String[]{"001", "A"},
new String[]{"002", "B"},
new String[]{"003", "A"},
};
System.out.println("Looping Menggunakan For");
for (int i=0; i<daftarnilai.length; i++)
{
System.out.println("NPM   : " +daftarnilai[i][0]);
System.out.println("Nilai : " +daftarnilai[i][1]);
}
System.out.println("Selesai Looping For");
System.out.println();
System.out.println();
System.out.println("Looping Menggunakan While");
int ix = 0;
while(ix < daftarnilai.length)
{
System.out.println("NPM   : " +daftarnilai[ix][0]);
System.out.println("Nilai : " +daftarnilai[ix][1]);
ix++;
}
System.out.println("Selesai Looping While");
}
}