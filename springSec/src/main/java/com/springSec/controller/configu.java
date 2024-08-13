package com.springSec.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



/// -------------------------------------------> IN Memory   Configuration 
@Configuration
@EnableWebSecurity
public class configu extends WebSecurityConfigurerAdapter {
	
	

	// -------------------------------> authenticaton ----------------->
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// authenticaton is called 
//		// --------- set password in configue  you give username  and password   given that 
//		// auth.inMemoryAuthentication().withUser("amaresh").password("Amar123").roles("student");
//
//		auth.inMemoryAuthentication().withUser("amaresh")
//				.password("$2a$10$mDVVKB7ETQazgWqb4rBaz.cvF2C/MLyFu9jrF8cV9bjCl1VeR85KS").roles("student");
//
//	}

	
	/// ----------------------------------------------------------------------------------///----------------------------------
	
	/// Authorization ---- > is called specify the access

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// -----------> DEyprt ----------password 
		
//		auth.inMemoryAuthentication()
//		.withUser("amaresh").password("Amaresh123").roles("student")
//		.and().withUser("Hari").password("hari123").roles("manager")
//		.and().withUser("kamal").password("kamal123").roles("trainer");

		// ---------------------> EnCyprt ------------> password 
		
		auth.inMemoryAuthentication()
		.withUser("amaresh").password("$2a$10$OQLkaNZI/GsrANZ37bDwZuYhxCW.pUU6uUPnXL5jWIriRUgJ1muhC").roles("student")
		.and().withUser("Hari").password("$2a$10$5MgzAi2jyNK4tdmZ0Fh99eV8kKOLcTYTXU3D31WYnrwzybFkoH4TG").roles("manager")
		.and().withUser("kamal").password("$2a$10$RYLHYTvWCYGvE.DAllaJYOZ6eB/NqjMyUc9JBXkekbg0vtIveQzWm").roles("trainer");

		
		
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/manager").hasRole("manager");   // ----------> only acesss Manger 
		http.authorizeHttpRequests().antMatchers("/triner").hasAnyRole("manager","trainer");  /// ---------> tranier will access Manager and  tranier
		http.authorizeHttpRequests().antMatchers("/student").permitAll().and().formLogin(); // ------------> student is permit all with out give any User_id and password 
		
		
	}

// use to set password without Encrpyt ---------->
//@Bean
//public PasswordEncoder  pass() {
//	return NoOpPasswordEncoder.getInstance();
//}

// use to set Encrypt passWord  ---> identyfy the encpryt password
	
	
	
	
	@Bean
	PasswordEncoder pass() {
		return new BCryptPasswordEncoder(10);
	}




}
