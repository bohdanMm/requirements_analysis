package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;
import nulp.architecture.enums.Difficulty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.Duration;

@Getter
@Setter
@Entity
public class Level extends IdHolder {

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Duration time;

    @ManyToOne
    private MainUser creator;
}
