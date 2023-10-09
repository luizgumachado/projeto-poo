package bilheteria;
import tesouraria.Funcionario;
import tesouraria.QuadroFuncionarios;

public class Bilheteria {
    private QuadroFuncionarios colaboradores;

    private float valorIngresso;    //especifica o valor do ingresso inteiro

    public QuadroFuncionarios getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(QuadroFuncionarios colaboradores) {
        this.colaboradores = colaboradores;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
