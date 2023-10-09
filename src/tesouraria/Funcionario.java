package tesouraria;
import universal.Pessoa;


public class Funcionario extends Pessoa {
    private float salario;
    private String cargo;

    public Funcionario(String nome, String cpf, float salario, String cargo) {
        super(nome, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
