package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}

/* Uguale a dire
<beans>
    <bean id = "helloWorld" class = "com.demo.HelloWorld" />
</beans>
*/
