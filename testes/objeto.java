package objeto;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class objeto {
    public static void main(String[] args){
        tv televisao = new tv();
        System.out.println("Esta televisao é da marca : "+televisao.fabricante+" "
                + "\nA televisão esta "+(televisao.ligado==true ? "ligada" : "desligada"));
        televisao.ligar();
        televisao.aumentarvolume();
        
    }
}
