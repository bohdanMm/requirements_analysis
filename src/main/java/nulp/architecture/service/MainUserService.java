package nulp.architecture.service;

import lombok.RequiredArgsConstructor;
import nulp.architecture.domain.MainUser;
import nulp.architecture.domain.builder.MainUserBuilder;
import nulp.architecture.domain.dto.MainUserLogin;
import nulp.architecture.domain.dto.MainUserRequest;
import nulp.architecture.domain.dto.MainUserResponse;
import nulp.architecture.mapper.UserMapper;
import nulp.architecture.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MainUserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public MainUserResponse create(MainUserRequest mainUserRequest) {
        MainUser mainUser = MainUserBuilder.builder()
                .email(mainUserRequest.getEmail())
                .password(mainUserRequest.getPassword())
                .phoneNumber(mainUserRequest.getPhoneNumber())
                .build();
        return userMapper.toResponseDto(userRepository.save(mainUser));
    }

    public MainUserResponse login(MainUserLogin mainUserLogin) {
        MainUser user = userRepository.findByEmailAndPassword(mainUserLogin.getEmail(), mainUserLogin.getPassword())
                .orElseThrow(() -> new NoSuchElementException("User with such credentials not found!"));
        return userMapper.toResponseDto(user);
    }

}
