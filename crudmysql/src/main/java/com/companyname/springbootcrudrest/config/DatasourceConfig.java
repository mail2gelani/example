/*
 * package com.companyname.springbootcrudrest.config;
 * 
 * 
 * import java.util.HashMap; import javax.persistence.EntityManagerFactory;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Qualifier; import
 * org.springframework.boot.autoconfigure.jdbc.DataSourceProperties; import
 * org.springframework.boot.context.properties.ConfigurationProperties; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.Primary; import
 * org.springframework.core.env.Environment; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.orm.jpa.JpaTransactionManager; import
 * org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; import
 * org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter; import
 * org.springframework.transaction.PlatformTransactionManager; import
 * org.springframework.transaction.annotation.EnableTransactionManagement;
 * import com.zaxxer.hikari.HikariConfig; import
 * com.zaxxer.hikari.HikariDataSource;
 * 
 *//**
	 * 
	 * The Class ConfiguationDatabaseConfiguration.
	 * 
	 */
/*
 * 
 * @Configuration
 * 
 * @EnableTransactionManagement
 * 
 * @EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",
 * transactionManagerRef = "transactionManager", basePackages =
 * "com.companyname.springbootcrudrest")
 * 
 * public class DatasourceConfig extends HikariConfig {
 * 
 * 
 * 
 *//** The env. */
/*
 * 
 * @Autowired private Environment env;
 * 
 * 
 * 
 * 
 * 
 *//**
	 * 
	 * Data source properties.
	 *
	 * 
	 * 
	 * @return the data source properties
	 * 
	 */
/*
 * 
 * @Primary
 * 
 * @Bean(name = "dataSourceProperties")
 * 
 * @ConfigurationProperties("spring.datasource")
 * 
 * protected static DataSourceProperties dataSourceProperties() { return new
 * DataSourceProperties(); }
 * 
 * 
 * 
 *//**
	 * 
	 * Data source.
	 *
	 * 
	 * 
	 * @param properties
	 * 
	 *                   the properties
	 * 
	 * @return the hikari data source
	 * 
	 */
/*
 * 
 * @Primary
 * 
 * @Bean
 * 
 * @ConfigurationProperties(prefix = "spring.datasource")
 * 
 * public HikariDataSource dataSource(@Qualifier("dataSourceProperties")
 * DataSourceProperties properties) { return
 * properties.initializeDataSourceBuilder().type(HikariDataSource.class).build()
 * ; }
 * 
 * 
 * 
 *//**
	 * 
	 * Entity manager factory.
	 *
	 * 
	 * 
	 * @return the local container entity manager factory bean
	 * 
	 */
/*
 * 
 * @Primary
 * 
 * @Bean(name = "entityManagerFactory")
 * 
 * public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
 * 
 * HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
 * 
 * jpaVendorAdapter.setGenerateDdl(true);
 * 
 * 
 * 
 * LocalContainerEntityManagerFactoryBean factoryBean = new
 * LocalContainerEntityManagerFactoryBean();
 * 
 * 
 * 
 * factoryBean.setDataSource(dataSource(dataSourceProperties()));
 * 
 * factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
 * 
 * // factoryBean.setPackagesToScan("com.pki.nextgen.rulesmanagement.domain.*");
 * 
 * factoryBean.setPersistenceUnitName("entityManagerFactory");
 * 
 * HashMap<String, Object> properties = new HashMap<>();
 * 
 * properties.put("hibernate.dialect",
 * env.getProperty("spring.jpa.properties.hibernate.dialect"));
 * 
 * properties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
 * 
 * properties.put("hibernate.hbm2ddl.auto",
 * env.getProperty("spring.jpa.hibernate.ddl-auto"));
 * 
 * 
 * 
 * factoryBean.setJpaPropertyMap(properties);
 * 
 * 
 * 
 * return factoryBean;
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 *//**
	 * 
	 * Transaction manager.
	 *
	 * 
	 * 
	 * @param entityManagerFactory
	 * 
	 *                             the entity manager factory
	 * 
	 * @return the platform transaction manager
	 * 
	 */
/*
 * 
 * @Primary
 * 
 * @Bean(name = "transactionManager")
 * 
 * public static PlatformTransactionManager transactionManager(
 * 
 * @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory)
 * {
 * 
 * return new JpaTransactionManager(entityManagerFactory);
 * 
 * }
 * 
 * 
 * 
 *//**
	 * 
	 * Gets the env.
	 *
	 * 
	 * 
	 * @return the env
	 * 
	 */
/*
 * 
 * public Environment getEnv() {
 * 
 * return env;
 * 
 * }
 * 
 * 
 * 
 *//**
	 * 
	 * Sets the env.
	 *
	 * 
	 * 
	 * @param env
	 * 
	 *            the new env
	 * 
	 *//*
		 * 
		 * public void setEnv(Environment env) {
		 * 
		 * this.env = env;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 */