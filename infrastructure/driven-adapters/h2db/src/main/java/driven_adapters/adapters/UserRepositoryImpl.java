package driven_adapters.adapters;

import driven_adapters.DBO.UserDBO;
import driven_adapters.repository.IUserRepository;
import gateway.IUserGateway;
import model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserRepositoryImpl implements IUserGateway {

    public final IUserRepository iUserRepository;

    public UserRepositoryImpl(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }


    @Override
    public String createUser(User user) {
        iUserRepository.save(UserDBO.fromDomain(user));
        return "";
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

}
