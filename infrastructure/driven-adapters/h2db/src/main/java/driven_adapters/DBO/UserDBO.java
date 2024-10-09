package driven_adapters.DBO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import model.User;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@Getter
@Setter
public class UserDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;



    public static User toDomain(UserDBO userDBO) {
        return new User(userDBO.getId(), userDBO.getName(), userDBO.getEmail());
    }

    public static UserDBO fromDomain(User user) {
        UserDBO userDBO = new UserDBO();
        userDBO.id = user.getId();
        userDBO.name = user.getName();
        userDBO.email = user.getEmail();
        return userDBO;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
