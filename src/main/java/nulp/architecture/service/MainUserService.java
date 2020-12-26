package nulp.architecture.service;

import nulp.architecture.domain.MainUser;
import nulp.architecture.domain.builder.MainUserBuilder;
import nulp.architecture.domain.dto.MainUserRequest;
import org.springframework.stereotype.Service;

@Service
public class MainUserService {

    public MainUser create(MainUserRequest mainUserRequest) {
        MainUser mainUser = MainUserBuilder.builder()
                .email(mainUserRequest.getEmail())
                .password(mainUserRequest.getPassword())
                .phoneNumber(mainUserRequest.getPhoneNumber())
                .build();

    }
}
