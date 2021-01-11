package nulp.architecture.controller;

import lombok.RequiredArgsConstructor;
import nulp.architecture.domain.Level;
import nulp.architecture.domain.dto.LevelAnswerDto;
import nulp.architecture.domain.dto.LevelCreationDto;
import nulp.architecture.service.LevelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("level")
public class LevelController {

    private final LevelService levelService;

    @PostMapping("create")
    public void createLevel(@RequestBody LevelCreationDto levelCreationDto){
        levelService.create(levelCreationDto);
    }

    @GetMapping
    public List<Level> getAllLevels(){
        return levelService.getLevels();
    }

    @GetMapping("{id}")
    public Level geLevelById(@PathVariable Long id){
        return levelService.getById(id);
    }

    @PostMapping("answer")
    public Long answer(@RequestBody LevelAnswerDto levelAnswerDto){
        return levelService.answer(levelAnswerDto);
    }
}
