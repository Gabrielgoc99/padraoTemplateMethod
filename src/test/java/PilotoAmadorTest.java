
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotoAmadorTest {

    @Test
    void returnClassificado() {
        PilotoAmador piloto = new PilotoAmador();
        piloto.setTempoVolta1(1.59f);
        piloto.setTempoVolta2(1.45f);
        piloto.setTempoVolta3(2.03f);
        assertEquals("Classificado!", piloto.verificarTempoVolta());
    }

    @Test
    void returnDesclassificado() {
        PilotoAmador piloto = new PilotoAmador();
        piloto.setTempoVolta1(2.19f);
        piloto.setTempoVolta2(1.59f);
        piloto.setTempoVolta3(2.40f);
        assertEquals("Desclassificado!", piloto.verificarTempoVolta());
    }

    @Test
    void deveRetornarInformacoes() {
        PilotoProfissional piloto = new PilotoProfissional();
        piloto.setTempoVolta1(2.19f);
        piloto.setTempoVolta2(1.59f);
        piloto.setTempoVolta3(2.40f);
        piloto.setNome("Rubens");
        piloto.setNroRegistro(1);
        assertEquals("Piloto Profissional{nroRegistro=1, nome='Rubens', result=Desclassificado!}", piloto.getInfo());
    }
}
