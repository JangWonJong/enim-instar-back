package come.mine.User.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity @Eager
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column private @NotNull String address;
    @Column private @NotNull String birth;
    @Column private @NotNull String tel;
    @Column private String token;


}
