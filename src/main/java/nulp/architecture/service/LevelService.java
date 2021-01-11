package nulp.architecture.service;

import lombok.RequiredArgsConstructor;
import nulp.architecture.domain.AnswerOption;
import nulp.architecture.domain.Level;
import nulp.architecture.domain.Task;
import nulp.architecture.domain.dto.LevelAnswerDto;
import nulp.architecture.domain.dto.LevelCreationDto;
import nulp.architecture.domain.dto.TaskAnswerDto;
import nulp.architecture.mapper.LevelCreationMapper;
import nulp.architecture.repository.LevelRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LevelService {

    private final LevelRepository levelRepository;
    private final LevelCreationMapper levelCreationMapper;

    public void create(LevelCreationDto levelCreationDto) {
        Level level = levelCreationMapper.toEntity(levelCreationDto);
        levelRepository.save(level);
    }

    public Level getById(Long id) {
        return levelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Level with id: " + id + " not found!"));
    }

    public List<Level> getLevels() {
        return levelRepository.findAll();
    }

    public Long answer(LevelAnswerDto levelAnswerDto) {
        Long score = 100L;
        Level level = levelRepository.getOne(levelAnswerDto.getLevel());
        Map<Long, List<Task>> taskMap = level.getTasks().stream().collect(Collectors.groupingBy(Task::getId));
        for (TaskAnswerDto task : levelAnswerDto.getTaskAnswers()) {
            long taskScore = score / levelAnswerDto.getTaskAnswers().size();
            score -= taskScore;
            List<AnswerOption> answers = taskMap.get(task.getTask())
                    .stream()
                    .flatMap(task1 -> task1.getAnswers().stream())
                    .filter(answerOptions -> Objects.nonNull(answerOptions.getOrderNumber()))
                    .sorted(Comparator.comparing(AnswerOption::getOrderNumber))
                    .collect(Collectors.toList());
            long answerScore = taskScore / answers.size();
            for (int i = 0; i < answers.size(); i++) {
                if(answers.get(i).getId().equals(task.getAnswers().get(i).getAnswerId())){
                    score += answerScore;
                }
            }
        }
        return score;
    }
}
