package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;
import nulp.architecture.enums.Difficulty;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Getter
@Setter
@Entity
public class Level extends IdHolder {

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Duration time;

    @ManyToOne
    private MainUser creator;

    @OneToMany(mappedBy = "level", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Task> tasks;
}
