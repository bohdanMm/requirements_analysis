package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Task extends IdHolder {

    private String description;

    @OneToOne
    private Sample sample;

    @ManyToOne
    private Level level;

    @OneToMany(mappedBy = "task", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<AnswerOption> answers;
}
