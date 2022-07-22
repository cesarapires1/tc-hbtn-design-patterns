public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int paginaTotais, int paginaColoridas, boolean ehFrenteVerso) {
        Impressao impressao = new Impressao();

        impressao.setTamanhoImpressao(tamanhoImpressao);
        impressao.setPaginasTotais(paginaTotais);
        impressao.setPaginasColoridas(paginaColoridas);
        impressao.setEhFrenteVerso(ehFrenteVerso);

        return impressao;
    }
}
