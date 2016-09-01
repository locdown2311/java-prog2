package objeto;
/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class tv {
    String fabricante = "Microsoft";
    int polegadas = 40;
    int volume =0;
    int canal = 44;
    boolean ligado = false;
    

    public void aumentarvolume(){
    if (volume<100){
        volume++;
    }
    else 
        System.out.println("Volume máximo");

    }
    
    public void diminuirvolume(){
        if(volume <=0){
            volume--;
        }
        else System.out.println("Mudo");
    }
    
    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
}