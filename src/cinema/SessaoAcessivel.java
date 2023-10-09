package cinema;

import java.util.Arrays;

public class SessaoAcessivel extends Sessao{
    Acessibilidade acesso;

    public void exibirInformacoes() {
        System.out.println("Filme: " + this.filmeEmExibicao);
        System.out.println("Salas " + Arrays.toString(this.salasExibindo));
        System.out.println("Horário: " + this.inicio);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Acessibilidade: Possui Acessibilidade p/ PcD");
    }
}