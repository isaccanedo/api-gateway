package br.com.isaccanedo;

import br.com.isaccanedo.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}

	@Bean
	public PatternServiceRouteMapper serviceRouteMapper(){
		return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)","${version}/${name}");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
