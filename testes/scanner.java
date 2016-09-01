package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class scanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Informe o valor da base : ");
        base = input.nextDouble();
        System.out.println("Informe o valor da altura : ");
        altura = input.nextDouble();
        double area = (base*altura)/2;
        
        System.out.println("A area de base : "+base +" multiplicado por : "+altura + " /2  = "+area);
    }
}
