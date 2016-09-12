package enem;
import javax.swing.JOptionPane;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class comandos {  
    protected double comandos(double nota1,double nota2,double nota3,double nota4,double nota5,String valor, String media,String cursos , double media2){
        //listas calcula = new listas();
        try{
            

        valor = JOptionPane.showInputDialog("Digite a nota em Ciências Humanas e suas Tecnologias :");
        nota1 = Double.parseDouble(valor.trim());
            while(nota1<0 || nota1>1000){
             valor = JOptionPane.showInputDialog("Digite a nota em Ciências Humanas e suas Tecnologias :");
             nota1 = Double.parseDouble(valor.trim());
            }
        
        valor = JOptionPane.showInputDialog("Digite a nota em Ciências da Natureza e suas Tecnologias :");
        nota2 = Double.parseDouble(valor.trim());
        
            while(nota2<0 || nota2>1000){
                 valor = JOptionPane.showInputDialog("Digite a nota em Ciências da Natureza e suas Tecnologias");
                 nota2 = Double.parseDouble(valor.trim());
            }
        
        valor = JOptionPane.showInputDialog("Digite a nota em Linguagens e Códigos :");
        nota3 = Double.parseDouble(valor.trim());
            
            while(nota3<0 || nota3>1000){
                valor = JOptionPane.showInputDialog("Digite a nota em Linguagens e Códigos : ");
                nota3 = Double.parseDouble(valor.trim());
            }
        
        valor = JOptionPane.showInputDialog("Digite a nota em Matemática :");
        nota4 = Double.parseDouble(valor.trim());
             while(nota4<0 || nota4>1000){
                valor = JOptionPane.showInputDialog("Digite a nota em Matemática :");
                nota4 = Double.parseDouble(valor.trim());
            }
        valor = JOptionPane.showInputDialog("Digite a nota em Redação :");
        nota5 = Double.parseDouble(valor.trim());
            
            while(nota5<0 || nota5>1000){
                valor = JOptionPane.showInputDialog("Digite a nota em Redação :");
                nota5 = Double.parseDouble(valor.trim());
            }
        }
        catch(Exception e){
            System.out.println("Erro ");
        }
        media2 = (float)(nota1+nota2+nota3+nota4+nota5)/5;
        media = String.format("A sua média geral no Enem é de : %.2f ",media2);
        JOptionPane.showMessageDialog(null,media);
        
        //calcula.mediaCalcula(media2);
        // VAI CHAMAR O LISTAS . JAVA PARA ANALISAR QUAL LISTA IRÁ IMPRIMIR
        if(media2 >= 600 && media2 <725){
            cursos = String.format("Com a sua média de %.2f , você PODE consegue passar em : \n"
                    + "Agronomia\n"
                    + "Arquitetura\n"
                    + "Ciências da Computação\n"
                    + "Educação Física\n"
                    + "Enfermagem\n"
                    + "Engenharia Civil\n"
                    + "Engenharia de Computação\n"
                    + "Engenharia de Produção\n"
                    + "Engenharia Elétrica \n"
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e outros...", media2);
            JOptionPane.showMessageDialog(null,cursos);
        }
        else if(media2>=725 && media2 <750){
            cursos = String.format("Com a média de %.2f, você PODE consegue passar em : \n"
                    + "Agronomia\n"
                    + "Arquitetura\n"
                    + "Ciências da Computação\n"
                    + "Educação Física\n"
                    + "Enfermagem\n"
                    + "Engenharia Aeroespacial\n"
                    + "Engenharia Aeronautica\n"
                    + "Engenharia Quimica\n"                    
                    + "Engenharia de Computação\n"
                    + "Engenharia de Produção\n"
                    + "Engenharia Civil\n"
                    + "Engenharia Elétrica \n"
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e diversos outros cursos", media2);
            JOptionPane.showMessageDialog(null,cursos);
                    
        }
        else if (media2 >=750 && media2 <850){
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
                    + "Medicina\n" // <-Bora Lorena :D S2
                    + "Sistemas de Informação\n"
                    + "Zootecnia\n"
                    + "e diversos outros cursos", media2);
            JOptionPane.showMessageDialog(null,cursos);
        }
        else if (media2 >= 850 && media2 <1000){
            cursos = String.format("Você consegue passar em praticamente TODOS os cursos do SISU com a nota %.2f"
                    + "\n \n PARABÉNS ",media2 );
            JOptionPane.showMessageDialog(null, cursos);
        }
        else if (media2 == 1000 || media2 == 0){
            cursos = String.format("A nota de %.2f é IMPOSSIVEL de ser tirada no Enem", media2);
            JOptionPane.showMessageDialog(null, cursos);
        }
        else if(media2>=400 && media2 < 600) {
            cursos = String.format("Com a média de %.2f, você consegue passar em \n:"
                    + "Passar do 3 ano pelo Enem\n"
                    + "Tirar diploma do Ensino Médio\n"
                    + "AINDA NÃO FOI IMPLEMENTADO , AGUARDE UPDATES \n", media2);
            JOptionPane.showMessageDialog(null,cursos);
        }
        else{
            cursos = String.format("Com uma nota inferior 400, você não consegue passar em nada"
                    + " e nem mesmo tirar diploma . Lamento");
            JOptionPane.showMessageDialog(null,cursos);
        }
        return 0;
 }
}