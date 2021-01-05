package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TaskCreationDto {

    private String description;

    private List<AnswerCreationDto> answers;
}
