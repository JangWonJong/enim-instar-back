package come.mine.User.domain;

import com.sun.istack.NotNull;
import come.mine.Post.domain.TimeEntity;
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
public class User extends TimeEntity{
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String nickname;
    @Column private @NotNull String email;


}
