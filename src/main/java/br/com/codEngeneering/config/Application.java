package br.com.codEngeneering.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("br.com.codEngeneering")
@EnableJpaRepositories("br.com.codEngeneering")
public class Application {
	String jdbcUrl = "jdbc:postgresql://localhost:5432/CodEngeneering";
	String user = "postgres";
	String password = "root";

	@Bean
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);

		dataSource.setDriverClass("org.postgresql.Driver");
		return dataSource;
	}

	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
			throws Exception {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan("br.com.codEngeneering");

		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.ejb.naming_strategy",
				"org.hibernate.cfg.ImprovedNamingStrategy");
		jpaProperties.put("hibernate.show_sql", "true");
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");

		em.setJpaProperties(jpaProperties);
		em.setJpaVendorAdapter(hibernateJpaVendorAdapter());

		return em;
	}

	@Bean
	public JpaTransactionManager transactionManager() throws Exception {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		tm.setJpaDialect(new HibernateJpaDialect());

		return tm;
	}

	private HibernateJpaVendorAdapter hibernateJpaVendorAdapter() {
		HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
		va.setShowSql(true);
		va.setGenerateDdl(true);
		va.setDatabase(Database.POSTGRESQL);
		return va;
	}

}

