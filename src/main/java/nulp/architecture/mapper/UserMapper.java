package nulp.architecture.mapper;

import nulp.architecture.domain.MainUser;
import nulp.architecture.domain.dto.MainUserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    MainUserResponse toResponseDto(MainUser mainUser);
}
