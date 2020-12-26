package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class TaskPassing extends IdHolder {

    private Integer score;

    @ManyToOne
    private Task task;

    @ManyToOne
    private LevelPassing levelPassing;

    @OneToMany(mappedBy = "taskPassing")
    private List<UserAnswer> userAnswers;
}
