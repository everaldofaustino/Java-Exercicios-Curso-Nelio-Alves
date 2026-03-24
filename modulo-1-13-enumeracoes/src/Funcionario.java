public class Funcionario {

    private int id;
    private String nome;
    private Double salario;

    public Funcionario(int id, String nome,Double salario){
        this.id=id;
        this.nome = nome;
        this.salario = salario;

    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(int id, Double salario){
        this.salario = salario;
    }

    public String toString(){
        return id+" ,"+nome+" ,"+salario;
    }


}
