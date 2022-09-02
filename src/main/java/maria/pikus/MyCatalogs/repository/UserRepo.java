package maria.pikus.MyCatalogs.repository;


import maria.pikus.MyCatalogs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
