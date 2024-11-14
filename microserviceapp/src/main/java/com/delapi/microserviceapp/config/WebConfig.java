/*
 * package com.delapi.microserviceapp.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.web.servlet.config.annotation.CorsRegistry; import
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 * 
 * @Configuration public class WebConfig implements WebMvcConfigurer {
 * 
 * @Override public void addCorsMappings(CorsRegistry registry) {
 * registry.addMapping("/**") // Allow all paths
 * .allowedOrigins("http://localhost/4200") // Allow all origins, or specify a
 * particular domain .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
 * // Allow specific methods .allowedHeaders("*") // Allow all headers
 * .allowCredentials(true); // Allow cookies (optional) } }
 */


package com.delapi.microserviceapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @Configuration public class WebConfig{
 * 
 * @Bean public WebMvcConfigurer corsConfig() { return new WebMvcConfigurer() {
 * 
 * @Override public void addCorsMappings(CorsRegistry corsRegistry) {
 * corsRegistry.addMapping("/**") // Allow all paths
 * .allowedOrigins("http://localhost/4200") // Allow all origins, or specify a
 * .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
 * .allowedHeaders("*"); // Allow all headers // Allow cookies (optional) } } }
 * }; } }
 */
