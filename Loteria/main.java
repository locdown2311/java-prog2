package loto;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class main {
    public static void main(String[] args){
        script sorteio = new script();
        Scanner input = new Scanner(System.in);
        Random loteria = new Random();
        boolean acertou = false;
        int tentativa = 10;
        int segredo = loteria.nextInt(100);
        String chute = null;
        long vChute  = 0;
        sorteio.loto(acertou,tentativa,segredo,chute,vChute);
        
        
    }
}
