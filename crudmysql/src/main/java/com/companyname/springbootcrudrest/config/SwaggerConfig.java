/**
 * 
 */
package com.companyname.springbootcrudrest.config;

import static com.google.common.base.Predicates.and;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig.
 *
 * @author 144690
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Instantiates a new swagger config.
	 */
	SwaggerConfig() {
	}

	/**
	 * Api.
	 *
	 * @return the docket
	 */
	@Bean
	public static Docket api() {
		@SuppressWarnings("unchecked")
		Predicate<RequestHandler> apiPredicates = and(
				basePackage("com.companyname.springbootcrudrest.controller"));
		return new Docket(DocumentationType.SWAGGER_2).select().apis(apiPredicates).paths(PathSelectors.any()).build();
	}
}
