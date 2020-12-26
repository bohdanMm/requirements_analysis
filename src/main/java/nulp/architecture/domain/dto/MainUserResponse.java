package nulp.architecture.domain.dto;

import lombok.Getter;
import lombok.Setter;
import nulp.architecture.enums.Role;

@Getter
@Setter
public class MainUserResponse {
    private Long id;

    private String fullName;

    private String phoneNumber;

    private String email;

    private Role role;
}
