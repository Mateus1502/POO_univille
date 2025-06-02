public class Gerente extends Formula{
    @Override
    public void salarioMes(int hora,double valorHora, double adicional){
        this.adicional = adicional;
        salario = hora * (valorHora + (valorHora * adicional));
        System.out.println("O salario é: "+ salario);
    }
}
