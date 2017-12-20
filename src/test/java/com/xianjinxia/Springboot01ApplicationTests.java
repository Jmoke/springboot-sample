package com.xianjinxia;

import com.xianjinxia.config.AppConfig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class Springboot01ApplicationTests {

	@Autowired
	AppConfig appConfig;

	@Test
	public void contextLoads() {
		out.println(appConfig.getName());
	}

	public static void main(String[] args){

		//写入文件
		try {
			FileUtils.writeByteArrayToFile(new File("E:\\1.txt"),"123456".getBytes());
			out.println("OK");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
