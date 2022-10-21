package com.bg.springsecutity01hello.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 授权规则
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//       首页所哟人可以访问，功能页是能对应权限的人才能访问
        //请求授权的规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        //没有权限到登录页,转发到登录页，所有的请求都到登录页面上去了。不是我们的登录页面
        http.formLogin();

        //注销,开启注销功能
        //注销都是使用get请求，不安全。使用crf防止
        http.csrf().disable();//登出失败可能的原因
        http.logout().logoutSuccessUrl("/");

        //定制登录页
        http.formLogin().loginPage("/login");

        //rememberme
        http.rememberMe();
    }


    /**
     * 认证用户
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

     //   这些应该在数据库中读
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("aa").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3").and()
               .withUser("bb").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1").and()
               .withUser("cc").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3");
    }
}
