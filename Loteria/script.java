package loto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class script {
    public void loto(boolean acertou , int tentativa , int segredo ,String chute, long vChute){
        ArrayList <Long> erros = new ArrayList<>();
        while(tentativa>0 && acertou == false){
            chute = JOptionPane.showInputDialog("Digite seu palpite");
            vChute= Long.parseLong(chute.trim());
            
            if(vChute == segredo){
                String palpiteC = String.format("Parabéns , você acertou !!");
                JOptionPane.showMessageDialog(null,palpiteC);
                acertou = true;
            }
            else if(vChute<segredo){
                erros.add(vChute);
                String palpiteC = String.format("O seu número está abaixo do segredo !!\n"
                        + "Seus palpites até o momento : \n%s\n\n"
                        + "Tentativas restantes : %d ",erros.toString(),tentativa);
                JOptionPane.showMessageDialog(null,palpiteC);
                tentativa--;
            }
            else if (vChute>segredo){
                erros.add(vChute);
                String palpiteC = String.format("O seu número está acima do segredo !!\n"
                        + "Seus palpites até o momento : \n%s\n\n"
                        + "Tentativas restantes : %d ",erros.toString(),tentativa);
                JOptionPane.showMessageDialog(null,palpiteC); 
                tentativa--;
            }
            
        }
        if(tentativa == 0){
            String palpiteC = String.format("Você não tem mais tentativas :( \n "
                    + "O número era : %d!!",segredo);
            JOptionPane.showMessageDialog(null,palpiteC);
        }
    }
}
