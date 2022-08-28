package com.daveproject.cloudgateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/bioServicefallback")
    @HystrixCommand(
            fallbackMethod = "planb",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
            })
    public String BioServiceFallBackMethod() {

        return "Hello People";

    }

    @GetMapping("/sendServicefallback")
    @HystrixCommand(
            fallbackMethod = "plana",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
            })
    public String SendServiceFallBackMethod() {

        return "Please chill";

    }

    private String planb() {
        return "Sorry our Systems are busy! try again later.";

    }

    private String plana() {
        return "Sorry our Systems are busy! try again later.";

    }
}