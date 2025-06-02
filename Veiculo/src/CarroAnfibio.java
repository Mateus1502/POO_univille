public class CarroAnfibio {
    private Carro carro = new Carro();
    private Barco barco = new Barco();

    public void dirigir(){
        carro.dirigir();
    }
    public void navegar(){
        barco.navegar();
    }

}
//Como ainda não vimos interfaces, farei assim, pois java não aceita heranças multiplas