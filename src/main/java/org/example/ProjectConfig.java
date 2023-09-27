package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {

 /*   @Bean
    People people1(){
        var p = new People();
        p.setName("Ivan");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }

    @Bean(name="marya")
    People people2(){
        var p = new People();
        p.setName("Mary");
        return p;
    }

    @Primary
    @Bean
    People people3(){
        var p = new People();
        p.setName("Alex");
        return p;
    }
*/


}
