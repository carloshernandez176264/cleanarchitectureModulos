package gateway;

import model.User;

import java.util.List;

public interface IUserGateway {

    String createUser(User user);
    List<User> getUsers();
}
