package org.TP1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.TP1")
@PropertySource("classpath:configuration.properties")
@EnableAspectJAutoProxy
public class SongConfig {
    
}
