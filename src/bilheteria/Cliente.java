package bilheteria;
import universal.Pessoa;

public class Cliente extends Pessoa {
    private int idade;
    private boolean isPcD;          // indica se eh pessoa portadora de deficiência
    public Cliente(String nome, String cpf, int idade, boolean PcD) {
        super(nome, cpf);
        this.idade = idade;
        this.isPcD = PcD;
    }

    public boolean isPcD() {
        return isPcD;
    }

    public void setPcD(boolean pcD) {
        isPcD = pcD;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}