package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;
import nulp.architecture.enums.Difficulty;

import java.time.Duration;
import java.util.List;

@Getter
@Setter
public class LevelCreationDto {

    private Difficulty difficulty;

    private Duration time;

    private Long creator;

    private List<TaskCreationDto> tasks;
}
