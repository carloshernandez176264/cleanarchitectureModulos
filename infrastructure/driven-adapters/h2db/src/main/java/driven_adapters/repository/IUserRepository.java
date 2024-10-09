package driven_adapters.repository;

import driven_adapters.DBO.UserDBO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserDBO, Integer> {

}
