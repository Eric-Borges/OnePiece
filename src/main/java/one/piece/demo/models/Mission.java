package one.piece.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
public class Mission {
    @NotNull
    private static Integer id = 0;
    @NotNull
    private MissionType missionType;
    @NotNull
    private boolean completed;
    @NotNull
    private DangerLevel dangerLevel;
    @NotNull
    @ManyToOne
    private Pirate pirate;
}
