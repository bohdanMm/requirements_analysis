package nulp.architecture.service;

import nulp.architecture.domain.MainUser;
import nulp.architecture.domain.builder.MainUserBuilder;
import nulp.architecture.domain.dto.MainUserRequest;
import org.springframework.stereotype.Service;

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
