package ivs.thai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ivs.thai.myBatis.Mapper")

public class QlnvSpringboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(QlnvSpringboot1Application.class, args);
	}

}
