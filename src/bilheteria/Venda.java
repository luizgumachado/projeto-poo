package bilheteria;

import cinema.Assento;
import cinema.Sessao;
import universal.Pessoa;
public class Venda {
    Pessoa cliente;
    Sessao exibicao;
    int sala;
    Assento assento;
    String tipoEntrada;

//    public void vendaIngresso(Pessoa cliente, Sessao sessaoFilme, Assento assento, String tipoEntrada) {
//
//        if(assento.isDisponível == false) {
//            System.out.println("ERRO - O ASSENTO JÁ ESTÁ RESERVADO!");
//            return;
//        }
//
//        ingresso = new Ingresso(Bilheteria.valorIngresso, sessaoFilme, assento, meiaEntrada, valorIngresso);
//        Tesouro.adicionarSaldo();
//        Interface.exibirIngresso(ingresso);
//    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Sessao getExibicao() {
        return exibicao;
    }

    public void setExibicao(Sessao exibicao) {
        this.exibicao = exibicao;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
}
