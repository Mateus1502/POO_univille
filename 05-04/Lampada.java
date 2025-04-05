public class Lampada {
    boolean ligada;

    public boolean isLigada() {
        return ligada;
    }
    public void ligar(){
        ligada = true;
        System.out.println("LIGADA");
    }
    public void desligar(){
        ligada = false;
        System.out.println("DESLIGADA");
    }
    public void mostrarEstado(){
        if(ligada){
            System.out.println("Lampada ligada");
        }else{
            System.out.println("Lampada desligada");
        }

    }
}
