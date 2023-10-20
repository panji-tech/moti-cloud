package com.moti;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableAsync;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableAsync
@SpringBootApplication
@Slf4j
public class MotiCloudApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext application = SpringApplication.run(MotiCloudApplication.class, args);
        ConfigurableEnvironment env = application.getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application: '{}' is running! Access URLs:\n\t" +
                        "后端地址: \t\thttp://127.0.0.1:{}/moti-cloud\n\t"+
                        "--------------服务启动完成------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"));
    }
}
