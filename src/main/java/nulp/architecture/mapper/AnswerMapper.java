package nulp.architecture.mapper;

import nulp.architecture.domain.AnswerOption;
import nulp.architecture.domain.dto.AnswerCreationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerMapper {

    AnswerOption toEntity(AnswerCreationDto answerCreationDto);
}
