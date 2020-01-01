package cn.jbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching  //开启缓存
public class TreeMenProjectApplicationTests {

	@Test
	public void contextLoads() {
	}

}
