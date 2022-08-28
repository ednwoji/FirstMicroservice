package com.daveproject.inner.Controller;


import com.daveproject.inner.Entity.BioEntity;
import com.daveproject.inner.Service.BioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping("/receive")
@Slf4j
public class BioController {


    @Autowired
    private BioService bioService;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/save")
    @ResponseBody
    public BioEntity SaveDetails(@RequestBody BioEntity bioEntity) {

        log.info("Trying to save User");

        return  bioService.saveCustomer(bioEntity);


    }


    @PostMapping("/exchange")
    public String createProducts(@RequestBody BioEntity bioEntity) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<BioEntity> entity = new HttpEntity<BioEntity>(bioEntity,headers);


        return restTemplate.exchange(
                "http://SENDING-SERVICE/external/save", HttpMethod.POST, entity, String.class).getBody();



    }









    @GetMapping("/{cusname}")
    public BioEntity fetchCustomerByName(@PathVariable("cusname") String cusname) {
        log.info("Trying to Fetch customer by Name");

        return bioService.fetchCustomerByName(cusname);

    }

    @GetMapping("/acc/{accno}")
    public BioEntity fetchCustomerByAcc(@PathVariable("accno") String accno) {
        log.info("Trying to Fetch customer by Name");

        return bioService.fetchCustomerByAcc(accno);

    }

}
