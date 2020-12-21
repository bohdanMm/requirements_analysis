package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class LevelPassing extends IdHolder {

    private Integer score;

    private Duration time;

    private LocalDateTime date;

    @ManyToOne
    private Level level;

    @ManyToOne
    private MainUser mainUser;

    @OneToMany(mappedBy = "levelPassing")
    private List<TaskPassing> taskPassingList;
}
