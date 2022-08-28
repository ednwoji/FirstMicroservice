package com.daveproject.External.Controller;


import com.daveproject.External.Entity.SendEntity;
import com.daveproject.External.Service.SendService;
import com.daveproject.External.ValueObject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external")
@Slf4j
public class SendController {

    @Autowired
    private SendService sendService;

    @PostMapping("/save")
    public SendEntity SendData(@RequestBody SendEntity sendEntity) {

        log.info("Receiving Data and sending");
        return sendService.saveData(sendEntity);

    }


    @GetMapping("/customer/{cusnames}")
    public SendEntity fetchCustomerByName(@PathVariable("cusnames") String cusnames) {
        log.info("Trying to Fetch customer by Name");

        return sendService.fetchCustomerByName(cusnames);

    }


    @GetMapping("/{cusnames}")
    public ResponseTemplateVO getUserwithBio(@PathVariable("cusnames") String cusnames) {
        log.info("Trying to Fetch customer by Name");

        return sendService.getDetailsWithCustomer(cusnames);
    }

}
