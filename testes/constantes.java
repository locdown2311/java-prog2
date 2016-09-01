package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 * Programa que faz área do circulo de acordo com pi
 */
public class constantes {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    final double pi = 3.14;
    System.out.println("Digite o tamanho do raio : ");
    double raio = input.nextDouble();
    double area = (raio*raio)*pi;
    System.out.println("O valor da área (aproximado) = "+area);
    
    
    
        
    }
}
