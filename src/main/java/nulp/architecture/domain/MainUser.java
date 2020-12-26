package nulp.architecture.domain;

import com.sun.istack.NotNull;
import lombok.*;
import nulp.architecture.enums.Role;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class MainUser extends IdHolder {

    @NotNull
    private String fullName;

    private String phoneNumber;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
