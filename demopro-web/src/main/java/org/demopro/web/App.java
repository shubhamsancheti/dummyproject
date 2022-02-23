package org.demopro.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = "org.demopro")
@EnableJpaRepositories(basePackages = { "org.demopro.dao" })
@EnableTransactionManagement
@EntityScan(basePackages = { "org.demopro.dao" })
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
