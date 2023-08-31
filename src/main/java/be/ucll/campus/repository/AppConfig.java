package be.ucll.campus.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
@Configuration
public class AppConfig {
    @Bean
    public EntityManager entityManager(){
        return Persistence
                .createEntityManagerFactory("campus")
                .createEntityManager();
    }
}
