public class WesterosPersonagemFactory extends PersonagemFactory{
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        Personagem personagemCreated = null;
        switch (tipo) {
            case MAGO:
                personagemCreated = new Mago(nome, 8,3,3,3,4);
                break;
            case LADRAO:
                personagemCreated = new Ladrao(nome, 1, 8, 7, 7, 10);
                break;
            case GUERREIRO:
                personagemCreated = new Guerreiro(nome, 0, 9, 7, 10, 7);
                break;
        }
        return personagemCreated;
    }
}
