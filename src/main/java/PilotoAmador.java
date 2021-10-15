
public class PilotoAmador extends Piloto {

    public String verificarTempoVolta() {
        if (this.tempoMedio() <= 2.00f) {
            return "Classificado!";
        }
        else {
            return "Desclassificado!";
        }
    }

}