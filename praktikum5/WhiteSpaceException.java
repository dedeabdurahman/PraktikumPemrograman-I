//praktikum 5
package Latihan05.sesi5.bin;
public class WhiteSpaceException extends Exception {

public WhiteSpaceException() {
   super("Terjadi Kesalahan : 'tidak boleh ada spasi / whitespace'");
}
public WhiteSpaceException(String text) {
   super("Terjadi Kesalahan : 'tidak boleh ada spasi / whitespace', text ; " + text);
   }
}
