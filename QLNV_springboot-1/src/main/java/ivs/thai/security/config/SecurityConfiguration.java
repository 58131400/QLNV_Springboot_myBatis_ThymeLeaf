package ivs.thai.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import ivs.thai.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UserService userService;
	 @Bean("authenticationManager")
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	            return super.authenticationManagerBean();
	    }
	@Bean
	public DaoAuthenticationProvider authenticationProvider(UserService userService) {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userService);
		authenticationProvider.setPasswordEncoder(bCryptPasswordEncoder);
		return authenticationProvider;
	}
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // @formatter:off
        auth.inMemoryAuthentication()
            .withUser("user1").password("{noop}user1Pass").roles("USER")
            .and()
            .withUser("admin1").password("{noop}admin1Pass").roles("ADMIN");
        // @formatter:on
    }
	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		
		auth.authenticationProvider(authenticationProvider(userService));
	}

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
        return new MySimpleUrlAuthenticationSuccessHandler();
    }
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.rememberMe().key("uniqueAndSecret").tokenValiditySeconds(1296000);
		
		
		http.authorizeRequests()
				.antMatchers("/","/home","/login","/registration").permitAll()
				.antMatchers("/admin**").hasAuthority("ROLE_ADMIN")
				.anyRequest()
				.authenticated()
			.and().csrf().disable().formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/login")
				.successHandler(myAuthenticationSuccessHandler())
				.failureUrl("/login?error=true")
				//.defaultSuccessUrl("/")
				.usernameParameter("username")
				.passwordParameter("password")	
			.and().logout()
				.deleteCookies("JSESSIONID")
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.and().exceptionHandling()
				.accessDeniedPage("/access-denied")
				
				.and().rememberMe().key("uniqueAndSecret").tokenValiditySeconds(86400);
		
	}
	@Override
	public void configure(WebSecurity web) throws Exception
	{ 
		web.ignoring().antMatchers("/css/**","/js/**","/sb-admin/**","/webjars/**","/jquery-ui/**","/images/**"); 
	}

	
	 
}
