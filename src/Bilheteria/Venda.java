package Bilheteria;
import main.Pessoa;
import Cinema.Sessão;
import Cinema.Assento;
public class Venda {
    Pessoa cliente;
    Sessão sessaoFilme;
    Assento assento;
    String tipoEntrada;

    public void vendaIngresso(Pessoa cliente, Sessão sessaoFilme, Assento assento, String tipoEntrada) {
        float valorIngresso;

        if(assento.disponivel == false) {
            System.out.println("ERRO - O ASSENTO JÁ ESTÁ RESERVADO!");
            return;
        }

        ingresso = new Ingresso(valorIngresso, sessaoFilme, assento, meiaEntrada, valorIngresso);
        Tesouro.adicionarSaldo();
        Interface.exibirIngresso(ingresso);
    }
}
