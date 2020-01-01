package cn.jbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("cn.jbit.dao")
@EnableCaching  //开启缓存
public class TreeMenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeMenProjectApplication.class, args);
	}

}
