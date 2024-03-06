package com.OnesoftProject;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class Onesoftconfig  extends WebSecurityConfigurerAdapter{
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("shalini").password("$2a$12$S8Xro4S3bE9KyBmVXq8PIOj0q3WfsEoVQgOgJD3a1K0Cs/eA5ncmi").roles("student");
			}
	@Bean
	public PasswordEncoder getPass()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public PasswordEncoder getPass()
	{
		return new BCryptPasswordEncoder(12);
	}*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("shalini").password("$2a$12$S8Xro4S3bE9KyBmVXq8PIOj0q3WfsEoVQgOgJD3a1K0Cs/eA5ncmi").roles("student").
		and().withUser("arul").password("$2a$12$UU8xo9PGk9fx5gMOhuurQegftwj/5BxQc7zvlrZqVrRfqw6JTe5ji").roles("trainer").and().
		withUser("mega").password("$2a$12$zKJ5aYi7x8Apcbja2QySj.suDSJ8lXH1/wF4Vq5qSImLVK5/7ZRA.").roles("manger");
			}
	
	@Bean
	public PasswordEncoder getPass()
	{
		return new BCryptPasswordEncoder(12);
	}
	@Override
	protected void configure(HttpSecurity http)throws Exception
	{
		http.authorizeRequests().antMatchers("/getmanger").hasRole("manger");
		http.authorizeRequests().antMatchers("/gettrainer").hasAnyRole("trainer","manger");
		http.authorizeRequests().antMatchers("/getStudent").permitAll().and().formLogin();
	}
}
