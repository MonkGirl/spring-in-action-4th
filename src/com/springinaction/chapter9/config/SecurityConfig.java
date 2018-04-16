package com.springinaction.chapter9.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	//
	// @Autowired
	// private SpitterRepository spitterRepository;

	private static final String FIND_USER_SQL = "select username, password ,'TRUE' from Spitter where username=?";

	private static final String AUTHORITIES_SQL = "select username, 'ROLE_USER' from Spitter where username=?";

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// 启用内存用户存储
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		// String encodedPassword = encoder.encode("password");
		// auth.inMemoryAuthentication()
		// .passwordEncoder(encoder)
		// .withUser("user").password(encodedPassword).roles("USER").and().withUser("admin")
		// .password(encodedPassword).roles("USER", "ADMIN");

		// 启用基于JDBC数据库表进行验证
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(FIND_USER_SQL)
				.authoritiesByUsernameQuery(AUTHORITIES_SQL).passwordEncoder(new BCryptPasswordEncoder());
		// //
		// // //启用基于LDAP(Lightweight Directory Access Protocol:轻量级目录访问协议)进行认证
		// // //默认情况下，从根开始查找
		// //
		// //auth.ldapAuthentication().userSearchFilter("(uid={0})").groupSearchFilter("member={0}");
		// // //设置用户，组查找层级
		// //
		// auth.ldapAuthentication().userSearchBase("ou=people").userSearchFilter("(uid={0})")
		// // .groupSearchBase("ou=groups").groupSearchFilter("member={0}")
		// // .passwordCompare()
		// // .passwordEncoder(new BCryptPasswordEncoder())
		// // .passwordAttribute("passcode")
		// // .and()
		// // .contextSource()
		// // //引用远程LDAP服务器
		// // //.url("ldap:springinaction.com:339/dc=springinaction,dc=com");
		// // //启用嵌入式LDAP服务器
		// // .root("dc=springinaction,dc=com")
		// // .ldif("classpath:/ldif/users.ldif");
		// //
		// // //基于非关系型数据库存储用户的认证
		// // auth.userDetailsService(new UserService(spitterRepository));
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/spitter/login").defaultSuccessUrl("/spitter/loginSuccess")
				.failureUrl("/spitter/loginFailure").and().rememberMe().and().httpBasic().realmName("spitter").and()
				.authorizeRequests().antMatchers("/spitter/me").authenticated();
		// .authorizeRequests().antMatchers("/spitter/me").not().hasRole("ADMIN");
		// .antMatchers("/spitter/others").denyAll();
		// .antMatchers(HttpMethod.POST, "/spittles").authenticated();
		// .anyRequest().permitAll();
	}
	
	public static void main(String...args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123"));
	}
}