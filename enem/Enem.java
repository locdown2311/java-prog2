package enem;
import java.util.Scanner;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class Enem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        comandos cmd = new comandos();
        String valor = null;
        String cursos = null;
        double nota1=0,
               nota2=0,
               nota3=0,
               nota4=0,
               nota5=0;
               String media = null;
               float media2 = 0;
        cmd.comandos(nota1, nota2, nota3, nota4, nota5, valor, media, cursos, nota2);        
    }
}
