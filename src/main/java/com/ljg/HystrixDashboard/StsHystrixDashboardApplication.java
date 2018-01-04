package com.ljg.HystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class StsHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsHystrixDashboardApplication.class, args);
	}
}
