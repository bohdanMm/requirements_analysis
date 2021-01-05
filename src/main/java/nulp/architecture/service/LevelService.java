package nulp.architecture.service;

import lombok.RequiredArgsConstructor;
import nulp.architecture.domain.Level;
import nulp.architecture.domain.dto.LevelCreationDto;
import nulp.architecture.mapper.LevelCreationMapper;
import nulp.architecture.repository.LevelRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LevelService {

    private LevelRepository levelRepository;
    private LevelCreationMapper levelCreationMapper;

    public void create(LevelCreationDto levelCreationDto){
        Level level = levelCreationMapper.toEntity(levelCreationDto);
        levelRepository.save(level);
    }
}
