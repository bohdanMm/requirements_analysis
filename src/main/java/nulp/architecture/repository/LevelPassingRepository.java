package nulp.architecture.repository;

import nulp.architecture.domain.LevelPassing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelPassingRepository extends JpaRepository<LevelPassing, Long> {
}
