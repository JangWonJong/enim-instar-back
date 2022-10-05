package come.mine.User.service;

import come.mine.Auth.domain.Messenger;
import come.mine.User.domain.User;
import come.mine.User.domain.UserDTO;

import java.util.List;

public interface UserService {

    Messenger save(UserDTO userDTO);
}
