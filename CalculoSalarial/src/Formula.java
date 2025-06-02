public class Formula {
    protected int hora;
    protected double valorHora;
    protected double adicional =0;
    protected double salario;

    public void salarioMes(int hora,double valorHora,double adicional){
        this.adicional = adicional;
        salario = hora * (valorHora + (valorHora * adicional));
        System.out.println("O salario é: "+ salario);
    }


}
