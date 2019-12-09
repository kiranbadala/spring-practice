/*
 * package com.kiran.spring.security.securerestapi;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * //@Configuration //@EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Override
 * 
 * @Bean protected UserDetailsService userDetailsService() { UserDetails user =
 * User.withDefaultPasswordEncoder().username("user").password("user").roles(
 * "ADMIN").build(); return new InMemoryUserDetailsManager(user); }
 * 
 * }
 */