package entry_points;

import DTO.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userusecase.UserUseCase;
import java.util.List;



@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor

public class UserEntryPoint {

    private final UserUseCase userUseCase;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        userUseCase.createUser(UserDTO.toDomain(userDTO));
        return ResponseEntity.ok("User created successfully");
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> users = userUseCase.getUsers().stream()
                .map(UserDTO::fromDomain)
                .toList();
        return new  ResponseEntity<>(users, HttpStatus.OK);
    }


}
