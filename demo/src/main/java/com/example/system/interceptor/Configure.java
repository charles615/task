package com.example.system.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configure implements WebMvcConfigurer {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        HandlerInterceptor interceptor = new LoginInterceptor();
        List<String> patterns = new ArrayList<>();
        patterns.add("/css/**");
        patterns.add("/images/**");
        patterns.add("/javascript/**");


        patterns.add("/user/signup");
        patterns.add("/user/login");
        patterns.add("/user/reset");
        patterns.add("/user/hello");

        patterns.add("/web/login.html");
        patterns.add("/web/signup.html");
        patterns.add("/web/reset.html");


        registry.addInterceptor(interceptor)
                .addPathPatterns("/**").excludePathPatterns(patterns);
    }
}
