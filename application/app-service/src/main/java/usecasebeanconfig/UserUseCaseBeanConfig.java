package usecasebeanconfig;



import gateway.IUserGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import userusecase.UserUseCase;

@Configuration
//@ComponentScan(basePackages = "driven_adapters")
public class UserUseCaseBeanConfig {


    @Bean
    public UserUseCase getUserUseCase(IUserGateway iUserGateway) {
        return new UserUseCase(iUserGateway);
    }

}
