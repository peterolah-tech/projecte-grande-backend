package com.codecool.projectegrandebackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenServices jwtTokenServices;

    public SecurityConfig(JwtTokenServices jwtTokenServices) {
        this.jwtTokenServices = jwtTokenServices;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // .antMatchers("/api/v1/auth/signin").permitAll() // allowed by anyone
                .antMatchers("/api/v1/signin").permitAll() // allowed by anyone
                .antMatchers("api/v1/signin").permitAll() // allowed by anyone
                .antMatchers(HttpMethod.POST,"api/v1/signin").permitAll() // allowed by anyone
                .antMatchers(HttpMethod.POST,"/api/v1/signin").permitAll() // allowed by anyone
                .antMatchers("/api/v1/registration").permitAll() // allowed by anyone
                .antMatchers("/api/v1/meal-summary/**").permitAll() // allowed by anyone
                .antMatchers("/api/v1/test-security").permitAll() // allowed by anyone
                .antMatchers("/api/v1/test-security2").permitAll() // allowed by anyone
                .antMatchers(HttpMethod.GET, "/api/v1/transport/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "/api/v1/add-meal").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.GET, "/api/v1/add-meal").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "api/v1/add-meal").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.GET, "api/v1/add-meal").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.GET, "/api/v1/recipes/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "/api/v1/ground-transport/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "/api/v1/flight-transport/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "/api/v1/airports").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/ev/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.POST, "/api/v1/ev/**").authenticated() // allowed only when signed in
                .antMatchers(HttpMethod.GET, "/api/v1/username").authenticated() // allowed only when signed in
                .anyRequest().denyAll() // anything else is denied
                .and()
                .addFilterBefore(new JwtTokenFilter(jwtTokenServices), UsernamePasswordAuthenticationFilter.class)
                .cors();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}