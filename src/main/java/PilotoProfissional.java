
public class PilotoProfissional extends Piloto {

    public String verificarTempoVolta() {
        if (this.tempoMedio() <= 1.30f) {
            return "Classificado!";
        }
        else {
            return "Desclassificado!";
        }
    }

    @Override
    public String getTipo() {
        return "Piloto Profissional";
    }
}