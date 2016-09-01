package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class Strings_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome ? ");
        String nome = input.next();
        System.out.println("Qual seu ultimo nome ? ");
        String ultimonome= input.next();
        System.out.println("Qual sua idade ? ");
        int idade = input.nextInt();
        System.out.println("Nome : "+nome + " "+ultimonome +"\nIdade : "+idade);
    }
}
