package come.mine.User.controller;

import come.mine.User.domain.UserDTO;
import come.mine.User.service.UserService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {
    public final UserService service;

    @PostMapping("/join")
    public ResponseEntity<?> save(@ApiParam("Join User") @RequestBody UserDTO userDTO){
        System.out.println("회원가입 정보:" + userDTO.toString());
        return ResponseEntity.ok(service.save(userDTO));
    }
}
