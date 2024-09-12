package swagger.swagger_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swagger.swagger_test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
