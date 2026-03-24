public class Conta {

    public double deposito;
    private String name;
    private int numero;
    private double saldo;




    public Conta(String name,int numero, double depositoInicial ){
        this.name = name;
        this.numero = numero;
        deposito(depositoInicial);

    }

    public Conta(String name,int numero){
        this.name = name;
        this.numero = numero;
    }



    public void deposito(double valor){

      saldo = saldo + valor;

    }

    public void saque(double valor){
        saldo = saldo - valor - 5;
    }

    public String getName(){
        return name;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String toString(){
        return "Conta: " +
                numero +
                ", Titular: " +
                name+ ", Saldo: " +
                String.format("" +
                        " $ %.2f",saldo);


    }

}
