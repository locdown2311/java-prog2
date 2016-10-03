package pkgEnem;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * Autor : Igor Carvalho Guimarães Matricula : 15.1.8382
 */
public class Enem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Comandos cmd = new Comandos();
        byte op;
        String op2;
//        listas lst = new listas();
        cmd.comandos();
        op2 = JOptionPane.showInputDialog("Deseja repetir o procedimento ? \n1=Sim , 2=Não");
        op = Byte.parseByte(op2.trim());
        if (op == 1) {
            main(args);
        } else if (op == 2) {
            System.console();
        }
    }
}
