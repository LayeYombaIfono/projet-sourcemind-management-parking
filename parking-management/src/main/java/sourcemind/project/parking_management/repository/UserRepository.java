package sourcemind.project.parking_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sourcemind.project.parking_management.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
