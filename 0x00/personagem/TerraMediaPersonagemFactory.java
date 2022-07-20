public class TerraMediaPersonagemFactory extends PersonagemFactory{

    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        Personagem personagemCreated = null;
        switch (tipo) {
            case MAGO:
                personagemCreated = new Mago(nome, 10,2,5,3,4);
                break;
            case LADRAO:
                personagemCreated = new Ladrao(nome, 2, 6, 8, 5, 10);
                break;
            case GUERREIRO:
                personagemCreated = new Guerreiro(nome, 1, 8, 5, 10, 6);
                break;
        }
        return personagemCreated;
    }
}
