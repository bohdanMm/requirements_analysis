package nulp.architecture.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class UserAnswer extends IdHolder {

    private Integer orderNumber;

    @ManyToOne
    private TaskPassing taskPassing;

    @ManyToOne
    private AnswerOption answerOption;
}
