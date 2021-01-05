package nulp.architecture.repository;

import nulp.architecture.domain.TaskPassing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskPassingRepository  extends JpaRepository<TaskPassing, Long> {
}
