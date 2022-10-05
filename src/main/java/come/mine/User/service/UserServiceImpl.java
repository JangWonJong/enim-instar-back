package come.mine.User.service;


import come.mine.Auth.domain.Messenger;
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
    public Messenger save(UserDTO userDTO) {
        System.out.println("전달된 정보:" + userDTO.toString());
        String result = "";
        if (userRepository.findByUsername(userDTO.getUsername()).isEmpty()) {
            userRepository.save(User.builder()
                    .username(userDTO.getUsername())
                    .nickname(userDTO.getNickname())
                    .password(userDTO.getPassword())
                    .email(userDTO.getEmail()).build());
            result = "SUCCESS";
        }else {
            result = "FAIL";
        }
        return Messenger.builder().message(result).build();
    }
}
