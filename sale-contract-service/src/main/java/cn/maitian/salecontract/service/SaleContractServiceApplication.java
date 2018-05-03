package cn.maitian.salecontract.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class SaleContractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleContractServiceApplication.class, args);
	}

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("hi-----"+name);
        return "hi "+name+",i am from port:" +port;
    }

}
