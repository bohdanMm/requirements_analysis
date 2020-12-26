package nulp.architecture.repository;

import nulp.architecture.domain.MainUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MainUser, Long> {

    Optional<MainUser> findByEmailAndPassword(String email, String password);
}
