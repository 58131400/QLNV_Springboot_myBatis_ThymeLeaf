package snippet;

public class Snippet {
	spring:
	  thymeleaf:
	    cache: false
	    check-template: true
	    check-template-location: true
	    content-type: text/html
	    enabled: true
	    encoding: UTF-8
	    mode: HTML
	    prefix: classpath:/templates/
	    suffix: .html
	    # excluded-view-names:
	    # template-resolver-order:
	    # view-names:
	
	logging:
	  level:
	    root: WARN
	    com.memorynotfound: DEBUG
	    org.springframework.web: INFO
	    org.springframework.security: INFO
}

