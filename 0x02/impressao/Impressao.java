public class Impressao {
    private Integer paginasTotais;
    private Integer paginasColoridas;
    private Boolean ehFrenteVerso;
    private Double valorColoridasFrenteVerso;
    private Double valorPretoBrancoFrenteVerso;
    private Double valorColoridasFrenteApenas;
    private Double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public Integer getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(Integer paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public Integer getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(Integer paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public Boolean getEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(Boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public Double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(Double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public Double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(Double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public Double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(Double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public Double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(Double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public Integer getPaginasPretoBranco(){
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
