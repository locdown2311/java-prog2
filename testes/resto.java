package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class resto {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um valor : ");
    int x = input.nextInt();
        if(x%2==0){
        System.out.println("Numero é par !");
        }
        else{
        System.out.println("O numero é impar !");
        }
    }
}
