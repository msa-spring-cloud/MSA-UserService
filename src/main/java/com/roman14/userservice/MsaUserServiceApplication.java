package com.roman14.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaUserServiceApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(MsaUserServiceApplication.class, args);
  }

}
