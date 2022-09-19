package come.mine.User.service;


import come.mine.User.domain.User;
import come.mine.User.domain.UserDTO;
import come.mine.User.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public List<User> save(UserDTO userDTO) {
        System.out.println("전달된 정보:" + userDTO.toString());
        String result = "";
        return null;
    }
}
