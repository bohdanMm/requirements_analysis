package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LevelAnswerDto {

    private Long level;

    private List<TaskAnswerDto> taskAnswers;
}
