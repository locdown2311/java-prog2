package pkgEnem;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * Autor : Igor Carvalho Guimarães 
 * Matricula : 15.1.8382
 */
public class Comandos {

    private String valor;
    private String cursos;
    private final double[] notas = new double[6];
    private String op2;
    private String media;
    private float media2 = 0;

    public Comandos() {
        this.valor = null;
        this.cursos = null;
        this.media = null;
    }

    public void comandos() {

        //listas calcula = new listas();
        try {

            valor = JOptionPane.showInputDialog("Digite a nota em Ciências Humanas e suas Tecnologias :");
            notas[0] = Double.parseDouble(valor.trim());
            while (notas[0] < 0 || notas[0] > 1000) {
                valor = JOptionPane.showInputDialog("Digite a nota em Ciências Humanas e suas Tecnologias :");
                notas[0] = Double.parseDouble(valor.trim());
            }

            valor = JOptionPane.showInputDialog("Digite a nota em Ciências da Natureza e suas Tecnologias :");
            notas[1] = Double.parseDouble(valor.trim());

            while (notas[1] < 0 || notas[1] > 1000) {
                valor = JOptionPane.showInputDialog("Digite a nota em Ciências da Natureza e suas Tecnologias");
                notas[1] = Double.parseDouble(valor.trim());
            }

            valor = JOptionPane.showInputDialog("Digite a nota em Linguagens e Códigos :");
            notas[2] = Double.parseDouble(valor.trim());

            while (notas[2] < 0 || notas[2] > 1000) {
                valor = JOptionPane.showInputDialog("Digite a nota em Linguagens e Códigos : ");
                notas[2] = Double.parseDouble(valor.trim());
            }

            valor = JOptionPane.showInputDialog("Digite a nota em Matemática :");
            notas[3] = Double.parseDouble(valor.trim());
            while (notas[3] < 0 || notas[3] > 1000) {
                valor = JOptionPane.showInputDialog("Digite a nota em Matemática :");
                notas[3] = Double.parseDouble(valor.trim());
            }
            valor = JOptionPane.showInputDialog("Digite a nota em Redação :");
            notas[4] = Double.parseDouble(valor.trim());

            while (notas[4] < 0 || notas[4] > 1000) {
                valor = JOptionPane.showInputDialog("Digite a nota em Redação :");
                notas[4] = Double.parseDouble(valor.trim());
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Erro ");
        }
        for (int i = 0; i < notas.length; i++) {
            media2 += (float) notas[i];
        }
        media2 /= 5;
        media = String.format("A sua média geral no Enem é de : %.2f ", media2);
        JOptionPane.showMessageDialog(null, media);

        if (media2 >= 600 && media2 < 725) {
            cursos = String.format("Com a sua média de %.2f , você PODE consegue passar em : \n"
                    + "Agronomia\n"
                    + "Arquitetura\n"
                    + "Ciências da Computação\n"
                    + "Educação Física\n"
                    + "Enfermagem\n"
                    + "Engenharia Ambiental\n"
                    + "Engenharia Civil\n"
                    + "Engenharia de Computação\n"
                    + "Engenharia de Produção\n"
                    + "Engenharia Elétrica \n"
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e outros...", media2);
            JOptionPane.showMessageDialog(null, cursos);
        } else if (media2 >= 725 && media2 < 750) {
            cursos = String.format("Com a média de %.2f, você PODE consegue passar em : \n"
                    + "Agronomia\n"
                    + "Arquitetura\n"
                    + "Ciências da Computação\n"
                    + "Educação Física\n"
                    + "Enfermagem\n"
                    + "Engenharia Aeroespacial\n"
                    + "Engenharia Aeronautica\n"
                    + "Engenharia Ambiental\n"
                    + "Engenharia Quimica\n"
                    + "Engenharia de Computação\n"
                    + "Engenharia de Produção\n"
                    + "Engenharia Civil\n"
                    + "Engenharia Elétrica \n"
                    + "Odontologia\n"
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e diversos outros cursos", media2);
            JOptionPane.showMessageDialog(null, cursos);

        } else if (media2 >= 750 && media2 < 850) {
            cursos = String.format("Com a média de %.2f, você PODE consegue passar em : \n"
                    + "Agronomia\n"
                    + "Arquitetura\n"
                    + "Ciências da Computação\n"
                    + "Direito\n"
                    + "Educação Física\n"
                    + "Enfermagem\n"
                    + "Engenharia Aeroespacial\n"
                    + "Engenharia Aeronautica\n"
                    + "Engenharia Quimica\n"
                    + "Engenharia de Computação\n"
                    + "Engenharia de Produção\n"
                    + "Engenharia Civil\n"
                    + "Engenharia Elétrica \n"
                    + "Odontologia\n"
                    + "Medicina\n" // <-Bora Lorena :D S2
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e diversos outros cursos", media2);
            JOptionPane.showMessageDialog(null, cursos);
        } else if (media2 >= 850 && media2 < 1000) {
            cursos = String.format("Você consegue passar em praticamente TODOS os cursos do SISU com a nota %.2f"
                    + "\n \n PARABÉNS ", media2);
            JOptionPane.showMessageDialog(null, cursos);
        } else if (media2 == 1000 || media2 == 0) {
            cursos = String.format("A nota de %.2f é IMPOSSIVEL de ser tirada no Enem", media2);
            JOptionPane.showMessageDialog(null, cursos);
        } else if (media2 >= 400 && media2 < 600) {
            cursos = String.format("Com a média de %.2f, você consegue passar em \n:"
                    + "Passar do 3 ano pelo Enem\n"
                    + "Tirar diploma do Ensino Médio\n"
                    + "AINDA NÃO FOI IMPLEMENTADO , AGUARDE UPDATES \n", media2);
            JOptionPane.showMessageDialog(null, cursos);
        } else {
            cursos = String.format("Com uma nota inferior 400, você não consegue passar em nada"
                    + " e nem mesmo tirar diploma . Lamento");
            JOptionPane.showMessageDialog(null, cursos);
        }

    }
}
