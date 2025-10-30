package one.piece.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@Builder
public class Pirate {
    @Id
    @NotNull
    private static Integer id = 0;
    @NotNull
    private String name;
    @NotNull
    private Race race;
    @NotNull
    private String crew;
    @NotNull
    private boolean captured;

    public String isCaptured(boolean captured) {
        if (captured == true) {
            return "Capturado";
        } else {
            return "Ativo";
        }
    }

    public String toString() {
        return "Nome: " + name +
                "\nId: " + id +
                "\nRaça: " + race +
                "\nTripulação: " + crew +
                "\nStatus: " + isCaptured(captured);
    }
}
