package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class restoGramas {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantia em gramas : ");
        int gramas = input.nextInt();
        int kilos = gramas/1000;
        gramas = gramas%1000;
        
        System.out.println("Total em kilos = "+kilos+"."+gramas);
        
    }
}
