package com.khauminhduy.config;

import com.khauminhduy.datasource.FakeDataSource;
import com.khauminhduy.factory.PetServiceFactory;
import com.khauminhduy.repositories.EnglishGreetingRepository;
import com.khauminhduy.repositories.EnglishGreetingRepositoryImpl;
import com.khauminhduy.services.ConstructorGreetingService;
import com.khauminhduy.services.I18nEnGreetingService;
import com.khauminhduy.services.I18nVNGreetingService;
import com.khauminhduy.services.PetService;
import com.khauminhduy.services.PrimaryGreetingService;
import com.khauminhduy.services.PropertyGreetingService;
import com.khauminhduy.services.SetterGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    public FakeDataSource fakeDataSource(
            @Value("${db.username}") String username,
            @Value("${db.password}") String password,
            @Value("${db.jdbcUrl}") String jdbcUrl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcUrl);

        return fakeDataSource;
    }

    @Bean
    public PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean("petService")
    public PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean("petService")
    public PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile("VN")
    @Bean("i18nService")
    public I18nVNGreetingService i18nVNGreetingService() {
        return new I18nVNGreetingService();
    }

    @Bean
    public EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN", "default"})
    @Bean("i18nService")
    public I18nEnGreetingService i18nEnGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    public PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

//    @Bean
    public ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    public PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    public SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

}
