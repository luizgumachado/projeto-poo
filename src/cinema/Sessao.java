package cinema;

public class Sessao {
    Filme filmeEmExibicao;
    Sala[] salasExibindo;
    java.time.LocalDateTime inicio;
    java.time.LocalDateTime fim;
    String idioma;          //identifica se eh dublado, legendado, ou idioma original
    boolean eh3d;
}
