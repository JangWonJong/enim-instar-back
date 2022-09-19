package come.mine.User.service;

import come.mine.User.domain.User;
import come.mine.User.domain.UserDTO;

import java.util.List;

public interface UserService {

    List<User> save(UserDTO userDTO);
}
