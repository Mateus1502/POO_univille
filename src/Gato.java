public class Gato extends Animal{
    //Quando criamos um construtor na classe pai,temos que criar na classe filho
    public Gato(){
        super("Garfield");//deve ser na primeira linha
    }
    @Override //SOBESCREVEMOS O METODO
    public void emitirsom() {
        //referencia ao pai
        super.emitirsom();
        System.out.println("MIAU FILHA DA PUTA!!!!");
        System.out.println(nome+",MIAU FILHA DA PUTA!!!!");
    }
    public void cacarRato(){
        System.out.println("Matarei o Jerry");
    }

}
