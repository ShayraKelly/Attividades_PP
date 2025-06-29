package Atividade_07;

import java.util.HashMap;
import java.util.Map;

public class FabricaVioloes {
    private static Map<String, ViolaoPrototype> prototipos = new HashMap<>();

    static {
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new ViolaoSeteCordas());
        prototipos.put("12cordas", new ViolaoDozeCordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duploZero", new ViolaoDuploZero());
        prototipos.put("triploZero", new ViolaoTriploZero());
    }

    public ViolaoPrototype criarViolao(String tipo) {
        ViolaoPrototype prototipo = prototipos.get(tipo);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        throw new IllegalArgumentException("Tipo de violão não encontrado: " + tipo);
    }
}
