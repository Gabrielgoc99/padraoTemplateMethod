



public abstract class Piloto {

    private int nroRegistro;
    protected String nome;
    private float tempoVolta1;
    private float tempoVolta2;
    private float tempoVolta3;

    public int getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTempoVolta1() {
        return tempoVolta1;
    }

    public void setTempoVolta1(float tempoVolta1) {
        this.tempoVolta1 = tempoVolta1;
    }

    public float getTempoVolta2() {
        return tempoVolta2;
    }

    public void setTempoVolta2(float tempoVolta2) {
        this.tempoVolta2 = tempoVolta2;
    }

    public float getTempoVolta3() {
        return tempoVolta3;
    }

    public void setTempoVolta3(float tempoVolta3) {
        this.tempoVolta3 = tempoVolta3;
    }

    public float tempoMedio() {
        return (this.tempoVolta1 + this.tempoVolta2 + this.tempoVolta3) / 3;
    }

    public abstract String verificarTempoVolta();

    public String getTipo() {
        return "Piloto Profissional";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nroRegistro=" + this.nroRegistro +
                ", nome='" + this.nome + '\'' +
                ", result=" + this.verificarTempoVolta() +
                '}';
    }
}