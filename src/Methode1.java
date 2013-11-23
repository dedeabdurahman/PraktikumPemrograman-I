//Exception Throw & catch
package Latihan01.sesi2.bin;

import java.io.*;
public class Methode1
{
static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
public static void main(String [] Xx)
{
try
{
System.out.println("Pilih [1/2/3] : " + "\n\t1. Udang" + "\n\t2. Kepiting" + " \n\t3. Kerang");
System.out.println();
System.out.println("Masukkan Pilihan anda : ");
String choose = input.readLine();

if(choose.equals("1"))
{
System.out.println("Anda Memilih Udang");
}
else if(choose.equals("2"))
{
System.out.println("Anda Memilih Kepiting");
}
else if(choose.equals("3"))
{
System.out.println("Anda Memilih Kerang");
}
else
{
throw new Exception("Pilihan Anda Tidak Terserdia !!!");
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}