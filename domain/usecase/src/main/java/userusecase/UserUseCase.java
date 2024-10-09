package userusecase;

import gateway.IUserGateway;

import model.User;

import java.util.List;

public class UserUseCase {

    private final IUserGateway iUserGateway;

    public UserUseCase(IUserGateway iUserGateway) {
        this.iUserGateway = iUserGateway;
    }

    public String createUser(User user){
        return iUserGateway.createUser(user);
    }

    public List<User> getUsers() {
        return iUserGateway.getUsers();
    }

}
