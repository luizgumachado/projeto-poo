package Tesouraria;

public class Tesouro {
    int caixa;                  //saldo financeiro do cinema
    int despesaCorrente;        //despesas "fixas" - inclui salários e custos de operação

    public void adicionarSaldo(int receita) {
        this.caixa += receita;
    }
}


// Venda.venderIngresso(meia, Sessão);
//
//
// Tesouro.adicionarSaldo(10000);