package cn.wt.bootrestful.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * 此类为配置类
 * @author Administrator
 */
@Configuration
public class RestConfig {
	@Bean
	public RestTemplate getRestTeplate() {
		return new RestTemplate();
	}
}
