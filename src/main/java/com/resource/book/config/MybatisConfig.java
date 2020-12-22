/**
 * @author honglixiang
 * @date 2020年12月9日
 */
package com.resource.book.config;

/**
 * @author 洪笠翔
 *
 */
// @org.springframework.context.annotation.Configuration
public class MybatisConfig {

    // @Bean
    // public Configuration getConfiguration() {
    // Configuration configuration = new Configuration();
    // configuration.setMapUnderscoreToCamelCase(true);
    // return configuration;
    // }
    //
    // @Bean(name = "sqlSessionFactory")
    // @Autowired
    // public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
    // SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    // bean.setDataSource(dataSource);
    // bean.setConfiguration(getConfiguration());
    // bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*.xml"));
    // return bean;
    // }
    //
    // @Bean(name = "mapperScannerConfigurer")
    // public MapperScannerConfigurer mapperScannerConfigurer() {
    // MapperScannerConfigurer bean = new MapperScannerConfigurer();
    // bean.setBasePackage(BookApplication.class.getPackage().getName() + ".mapper");
    // bean.setSqlSessionFactoryBeanName("sqlSessionFactory");
    // return bean;
    // }
}
