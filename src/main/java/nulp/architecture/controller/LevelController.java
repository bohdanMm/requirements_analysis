package nulp.architecture.controller;

import lombok.RequiredArgsConstructor;
import nulp.architecture.domain.dto.LevelCreationDto;
import nulp.architecture.service.LevelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("level")
public class LevelController {

    private final LevelService levelService;

    @PostMapping("create")
    public void createLevel(@RequestBody LevelCreationDto levelCreationDto){
        levelService.create(levelCreationDto);
    }
}
