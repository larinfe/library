package configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource("classpath:application.properties")
@Configuration

public class Config {

    //    @Autowired


    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432");
        dataSourceBuilder.username("fedos_db_user1");
        dataSourceBuilder.password("password");
        return dataSourceBuilder.build();
    }

}
