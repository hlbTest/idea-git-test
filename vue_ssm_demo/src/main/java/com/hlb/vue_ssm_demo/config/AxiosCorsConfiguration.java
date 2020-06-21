package com.hlb.vue_ssm_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration // 配置类  和@Bean使用 , 在后端解决跨域问题
public class AxiosCorsConfiguration {

    /**
     * 该配置主要解决跨域问题
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        // 初始化cors对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许跨域的域名,如果要携带cookie,则不能写*,只能写具体的域名 .  *:代表所有的域名都可以跨域访问
        //corsConfiguration.addAllowedOrigin("http://manage.leyou.com");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(false); // 允许携带cookie true , false就不允许携带
        corsConfiguration.addAllowedMethod("*"); // 允许所有的请求方法
        corsConfiguration.addAllowedHeader("*"); // 允许携带如何头信息
        // 初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);
        // 返回corsFilter实例 参数:cors配置源对象
        return new CorsFilter(configurationSource);
    }

}