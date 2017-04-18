package com.mitioglov.config;

/**
 * Created by Boris Mitioglov on 16/04/2017.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableWebSecurity
@EnableRedisHttpSession
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String SECURE_ADMIN_PASSWORD = "admin";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/chat")
                    .permitAll()
                    .and()
                .logout()
                    .logoutSuccessUrl("/")
                    .permitAll()
                    .and()
                .authorizeRequests()
                    .antMatchers("/", "/home").permitAll()
                    .antMatchers("/js/**", "/lib/**", "/images/**", "/css/**", "/index.html", "/").permitAll()
                    .antMatchers("/websocket").hasRole("ADMIN")
                    .anyRequest().authenticated();

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
//        auth.authenticationProvider(new AuthenticationProvider() {
//
//            @Override
//            public boolean supports(Class<?> authentication) {
//                return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//            }
//
//            @Override
//            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//                System.out.println("[TEST] Authentication" + authentication);
//                UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
//
//                List<GrantedAuthority> authorities = SECURE_ADMIN_PASSWORD.equals(token.getCredentials()) ?
//                        AuthorityUtils.createAuthorityList("ROLE_ADMIN") : null;
//
//                return new UsernamePasswordAuthenticationToken(token.getName(), token.getCredentials(), authorities);
//            }
//        });
    }
}

