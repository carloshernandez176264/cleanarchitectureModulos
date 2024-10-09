package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import model.User;

@Data
@RequiredArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private Integer id;
    private String name;
    private String email;


    public static UserDTO fromDomain(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    public static User toDomain(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
