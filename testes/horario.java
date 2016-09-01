package introdução;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class horario {
    public static void main(String[] args){
        long total_mil_seg = System.currentTimeMillis();
        long segundos = total_mil_seg/1000;
        long segundosAtual= segundos%60;
        
        long totalMinutos=segundos/60;
        long MinutoAtual = totalMinutos%60;
        
        long totalHoras = totalMinutos/60;
        long HorasAtual = (totalHoras%60)-3;
        
        System.out.println(HorasAtual+":"+ MinutoAtual+":"+segundosAtual);
    }
}
