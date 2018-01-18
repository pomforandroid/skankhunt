package com.swz.skankhunt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching  //开启缓存功能
@EnableScheduling //启用定时任务的配置 ,默认开启好像
public class SkankhuntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkankhuntApplication.class, args);
	}
}
