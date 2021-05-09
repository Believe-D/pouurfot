
package com.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

import javax.sql.DataSource;

/**
 * @author
 * @date 2020/12/6 13:17
 * @Description springsecurity配置类
 * @return
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private MyAuthenticationSuccessHandler authenticationSuccessHandler;

    @Autowired
    private MyAuthenticationFailHandler authenticationFailHandler;

    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors()
                .and().csrf().disable().headers().frameOptions().sameOrigin()
                .and().exceptionHandling().authenticationEntryPoint(new EntryPoint())
                .and().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/**").permitAll()
                .antMatchers("/grade/**").permitAll()
                .antMatchers("/public/**").permitAll();
                /*.anyRequest().authenticated()
                .and().formLogin().loginProcessingUrl("/public/login")
                .successHandler(authenticationSuccessHandler)
                .failureHandler(authenticationFailHandler)
                .and().userDetailsService(myUserDetailService)
                .logout().logoutSuccessHandler(new MyLogoutSuccessHandler()).deleteCookies("JSESSIONID");*/
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(new BCryptPasswordEncoder());
    }

    //允许多请求地址多加斜杠  比如 /msg/list   //msg/list
    @Bean
    public HttpFirewall httpFirewall() {
        return new DefaultHttpFirewall();
    }

}

