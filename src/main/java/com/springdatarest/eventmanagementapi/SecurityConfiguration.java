package com.springdatarest.eventmanagementapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Mohammad").password("{noop}MyPass").roles("USER")
                .and().withUser("Meepo").password("{noop}MepoPass").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST,"/events").hasRole("ADMIN").
                antMatchers(HttpMethod.PUT, "/events/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "events/**").hasRole("ADMIN").and().csrf().disable();
    }
}
