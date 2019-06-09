package co.edu.udea.diploma.microservicios.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import co.edu.udea.diploma.microservicios.gateway.configuration.RibbonConfiguration;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class DipMicrApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DipMicrApigatewayApplication.class, args);
	}

}
