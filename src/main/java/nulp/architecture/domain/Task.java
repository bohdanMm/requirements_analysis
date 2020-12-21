package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Task extends IdHolder {

    private String description;

    @OneToOne
    private Sample sample;

    @OneToMany(mappedBy = "task")
    private List<AnswerOption> answers;
}
