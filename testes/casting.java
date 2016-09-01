package introdução;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class casting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x,y,z,w;
        double a;
        System.out.println("Digite o valor de x: \n");
        x = input.nextInt();
        System.out.println("Digite o valor de z : \n");
        z = input.nextInt();
        a = (float)x/z;
        System.out.println(a);
    }
}
