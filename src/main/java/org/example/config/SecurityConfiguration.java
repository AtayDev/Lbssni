package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = {"org.example.config"})
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private PasswordEncoder encoder;

    @Autowired
    customUserDetailsService customUserDetailsService;

    @Autowired
    customAuthenticationSuccessHandler customAuthenticationSuccessHandler;

    //Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
           .antMatchers("/").permitAll()
           .antMatchers("/client/**").hasAuthority("ROLE_CLIENT")
           .antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
               .and().formLogin().permitAll()
               .successHandler(customAuthenticationSuccessHandler)
           .and()
           .logout()
           .permitAll()
           .and().csrf().disable();
    }

    //Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider());
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        encoder=new BCryptPasswordEncoder();
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(customUserDetailsService);
        authProvider.setPasswordEncoder(encoder);
        return authProvider;
    }
}
