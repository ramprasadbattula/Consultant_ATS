/*
 * package com.example.ats.config;
 * 
 * 
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import org.springframework.security.core.userdetails.User;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig {
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception { http .csrf(csrf -> csrf.disable())
 * .authorizeHttpRequests(authorize -> authorize
 * .requestMatchers("/api/users/register", "/api/users/login").permitAll()
 * .anyRequest().authenticated() ) .formLogin(form -> form .loginPage("/login")
 * .permitAll() );
 * 
 * return http.build(); }
 * 
 * @Bean public UserDetailsService userDetailsService() { PasswordEncoder
 * encoder = passwordEncoder(); return new InMemoryUserDetailsManager(
 * User.withUsername("user") .password(encoder.encode("password"))
 * .roles("USER") .build() ); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); } }
 */

