package nulp.architecture.mapper;

import nulp.architecture.domain.Level;
import nulp.architecture.domain.dto.LevelCreationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TaskMapper.class)
public interface LevelCreationMapper {

    Level toEntity(LevelCreationDto levelCreationDto);
}
