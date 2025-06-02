public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.salarioMes(220,20.66,0.05);
        Lider Mateus = new Lider();
        Mateus.salarioMes(220,15.70,0.02);
        Peao peao = new Peao();
        peao.salarioMes(220,11.56,0.07);
    }
}
