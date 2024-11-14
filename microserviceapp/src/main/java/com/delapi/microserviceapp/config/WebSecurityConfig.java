/*
 * package com.delapi.microserviceapp.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * 
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurityConfig {
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception { http .csrf().disable() // Disable CSRF since we’re using
 * JWT (stateless authentication) .authorizeHttpRequests((authz) -> authz
 * .anyRequest().permitAll() // Allow all requests (or customize) );
 * 
 * return http.build(); } }
 */