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
public class Sample extends IdHolder {

    @OneToOne(mappedBy = "sample")
    private Task task;

    @OneToMany(mappedBy = "sample")
    private List<AnswerOption> answers;
}
