package lyyljs.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lyyljs.cloud.eureka.config.FatherConfig;

/**
 * @EnableEurekaServer 通过该注解激活为Eureka服务器
 * 
 * @author lyyljs
 *
 */
@EnableEurekaServer
@SpringBootApplication
@EnableConfigurationProperties({FatherConfig.class})
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
