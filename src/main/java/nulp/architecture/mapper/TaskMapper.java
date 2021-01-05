package nulp.architecture.mapper;

import nulp.architecture.domain.Task;
import nulp.architecture.domain.dto.TaskCreationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AnswerMapper.class)
public interface TaskMapper {

    Task toEntity(TaskCreationDto taskCreationDto);
}
