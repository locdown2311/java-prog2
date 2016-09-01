package introdução;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class loteria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random loteria = new Random();
        boolean acertou = false;
        int tentativa =10;
        int segredo = loteria.nextInt(100);
        long chute = 0;
        
        while(tentativa>0 && acertou == false){
            System.out.println("Informe seu palpite : ");
            chute = input.nextLong();
            if(chute == segredo){
                System.out.println("Você ganhou !!");
                acertou = true;
            }
            else if(chute<segredo){
                    System.out.println("O numero é menor que o segredo ! "+tentativa+" tentativas restantes");
                    tentativa--;
            }
            else if (chute>segredo){
                    System.out.println("O numero é maior que o segredo !"+tentativa+" tentativas restantes");
                    tentativa--;
            }
            
        }
        System.out.println("Voce perdeu , o numero era :"+segredo);
    }
}
