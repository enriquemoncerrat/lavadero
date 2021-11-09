package configuracion;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import java.util.Collections;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket api(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				   .apis(RequestHandlerSelectors.basePackage("com.example.lavadero"))
				   .build()
				   .apiInfo(getApiInformation());
	}
	
	private ApiInfo getApiInformation(){
		return new ApiInfo("Api Lavadero",
				"Api de Gestion de clientes de lavadero ",
				"1.0",
				null,
				new Contact("Educacion It",null,null)
				,null
				,null,
				Collections.emptyList());
		
	}
	
	
}
