package Cinema;
public class Sessão {
    Sala[] salas;
    //mais de uma sala na mesma sessão
    //filme dentro de sala
    java.time.LocalDateTime inicio;
    java.time.LocalDateTime fim;
    String dublagem;          //identifica se eh dublado ou não

    Acessibilidade acesso;
    //verificar herança em acessibilidade
    //sessão & sessãoAcessível - sessãoAcessível possui objeto Acessibilidade
}