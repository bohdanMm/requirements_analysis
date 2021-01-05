package nulp.architecture.repository;

import nulp.architecture.domain.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
}
