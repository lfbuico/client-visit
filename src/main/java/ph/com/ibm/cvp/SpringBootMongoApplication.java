package ph.com.ibm.cvp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SpringBootMongoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoApplication.class, args);
	}
	
	/**
	 * This application is secured at both the URL level for some parts, and the method level for other parts. The URL
	 * security is shown inside this code, while method-level annotations are enabled at by
	 * {@link EnableGlobalMethodSecurity}.
	 *
	 * @author Greg Turnquist
	 * @author Oliver Gierke
	 */
	@Configuration
	@EnableGlobalMethodSecurity(prePostEnabled = true)
	@EnableWebSecurity
	static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		/**
		 * This section defines the user accounts which can be used for authentication as well as the roles each user has.
		 * 
		 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
		 */
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {

			auth.inMemoryAuthentication().//
					withUser("cvp_user").password("password").roles("USER").and().//
					withUser("cvp_admin").password("password").roles("USER", "ADMIN");
		}

		/**
		 * This section defines the security policy for the app.
		 * <p>
		 * <ul>
		 * <li>BASIC authentication is supported (enough for this REST-based demo).</li>
		 * <li>/employees is secured using URL security shown below.</li>
		 * <li>CSRF headers are disabled since we are only testing the REST interface, not a web one.</li>
		 * </ul>
		 * NOTE: GET is not shown which defaults to permitted.
		 *
		 * @param http
		 * @throws Exception
		 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
		 */
		@Override
		protected void configure(HttpSecurity http) throws Exception {

			http.httpBasic().and().authorizeRequests().//
					antMatchers(HttpMethod.POST, "/api/cvpApproval").hasRole("ADMIN").//
					antMatchers(HttpMethod.PUT, "/api/cvpApproval/**").hasRole("ADMIN").//
					antMatchers(HttpMethod.PATCH, "//api/cvpApproval/**").hasRole("ADMIN").and().//
					csrf().disable();
		}
	}
}
