package sourcemind.project.parking_management.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sourcemind.project.parking_management.repository.UserRepository;

@Service
//@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
