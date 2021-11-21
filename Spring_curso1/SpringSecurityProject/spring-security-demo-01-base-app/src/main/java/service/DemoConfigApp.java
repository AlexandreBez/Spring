package service;

import java.beans.PropertyVetoException;
import java.lang.System.Logger;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@Component("service")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoConfigApp {
    
    @Autowired
    private Environment env;

    private Logger logger = Logger.getLogger(getClass().getName());

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver();
    }

    @Bean
    public DataSource securityDataSource() {

        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();

        try{ 
            securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
        } catch(PropertyVetoException e){
            throw new RuntimeException(e);
        }

        logger.info("url: " + env.getProperty("jdbc.url"));
        logger.info("user: " + env.getProperty("jdbc.user"));

        securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        securityDataSource.setJdbcUrl(env.getProperty("jdbc.user"));
        securityDataSource.setJdbcUrl(env.getProperty("jdbc.password"));

        securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSieze"));
        securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSieze"));
        securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSieze"));
        securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));


        return securityDataSource;
    }

    private int getIntProperty(String propName){

        String propVal = env.getProperty("propName");

        int intPropVal = Integer.parseInt(propVal);
    }
}