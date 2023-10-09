package cinema;

public class Sala {
    private int numero;
    private Assento[][] lugares;

    public Sala(int numero, int linhas, int colunas) {
        this.numero = numero;
        this.lugares = new Assento[linhas][colunas];
    }
}