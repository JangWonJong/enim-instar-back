package come.mine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MineApplication.class, args);
	}

}
