package com.pxc.mybatisplus.config;

/**
 * @author 浦希成
 * 2018/11/1
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;



@Configuration
public class MybatisPlusConfig {


    /**
     * 性能分析拦截器，不建议生产使用
     */


    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }


}
