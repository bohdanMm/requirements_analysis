package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainUserRequest {

    private String fullName;

    private String phoneNumber;

    private String email;

    private String password;
}
