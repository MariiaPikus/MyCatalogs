package maria.pikus.MyCatalogs.repos;

import maria.pikus.MyCatalogs.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
