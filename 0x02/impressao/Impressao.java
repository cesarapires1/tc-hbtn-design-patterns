public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private Boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public Boolean getEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(Boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public int getPaginasPretoBranco(){
        return getPaginasTotais() - getPaginasColoridas();
    }

    public double calcularTotal(){

        switch (getTamanhoImpressao()){
            case A2:
                setValorPretoBrancoFrenteApenas(0.22);
                setValorColoridasFrenteApenas(0.32);
                setValorPretoBrancoFrenteVerso(0.18);
                setValorColoridasFrenteVerso(0.28);
                break;
            case A3:
                setValorPretoBrancoFrenteApenas(0.20);
                setValorColoridasFrenteApenas(0.30);
                setValorPretoBrancoFrenteVerso(0.15);
                setValorColoridasFrenteVerso(0.25);
                break;
            case A4:
                setValorPretoBrancoFrenteApenas(0.15);
                setValorColoridasFrenteApenas(0.25);
                setValorPretoBrancoFrenteVerso(0.10);
                setValorColoridasFrenteVerso(0.20);
                break;
        }

        if (getEhFrenteVerso()) {
            return getValorColoridasFrenteVerso()*getPaginasColoridas() + getValorPretoBrancoFrenteVerso()*getPaginasPretoBranco();
        }

        return getValorColoridasFrenteApenas()*getPaginasColoridas() + getValorPretoBrancoFrenteApenas()*getPaginasPretoBranco();
    }

    @Override
    public String toString() {

        String textoImpressao = "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + getPaginasPretoBranco() +
                ", " + (getEhFrenteVerso() ? "frente e verso" : "frente") +
                ". total: R$ " + String.format("%.2f", calcularTotal());

        return textoImpressao;
    }
}
