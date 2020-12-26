package nulp.architecture.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class AnswerOption extends IdHolder {

    @NotNull
    private String description;

    private Integer orderNumber;

    @ManyToOne
    private Sample sample;

    @ManyToOne
    private Task task;


}
