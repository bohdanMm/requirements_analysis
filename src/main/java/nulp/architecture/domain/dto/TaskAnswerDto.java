package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TaskAnswerDto {

    private Long task;

    private List<AnswerDto> answers;
}
