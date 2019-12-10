package ivs.thai.security.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

	@Bean 
	public BCryptPasswordEncoder passwordEncoder() { 
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(); 
		return bCryptPasswordEncoder; 
		} 

	@Override 
	public void addResourceHandlers(ResourceHandlerRegistry registry) 
	{ 
		registry.addResourceHandler("/css/**").addResourceLocations("/css/"); 
		registry.addResourceHandler("/js/**").addResourceLocations("/js/"); 
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/sb-admin/**").addResourceLocations("/sb-admin/"); 
	registry.addResourceHandler("/jquery-ui/**").addResourceLocations("/jquery-ui/");
	registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
	}
	//da ngon ngu
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(localeChangeInterceptor());
	}
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
	    LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
	    lci.setParamName("lang");
	    return lci;
	}
	
	//thymeleaf security dialect
	@Bean
	public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
	    final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver);
	    templateEngine.addDialect(sec); // Enable use of "sec"
	    return templateEngine;
	}
	@Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
    }
}
