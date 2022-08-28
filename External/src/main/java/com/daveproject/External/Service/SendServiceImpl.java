package com.daveproject.External.Service;


import com.daveproject.External.Entity.SendEntity;
import com.daveproject.External.Repository.SendRepo;
import com.daveproject.External.ValueObject.BioEntity;
import com.daveproject.External.ValueObject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SendServiceImpl implements SendService {

    @Autowired
    private SendRepo sendRepo;


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public SendEntity saveData(SendEntity sendEntity) {
        log.info("Repo is picking it");
        return sendRepo.save(sendEntity);
    }

    @Override
    public SendEntity fetchCustomerByName(String cusnames) {
        log.info("Parsing with Internal");

        return sendRepo.findByCusnames(cusnames);
    }

    @Override
    public ResponseTemplateVO getDetailsWithCustomer(String cusnames) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        SendEntity sendEntity = sendRepo.findByCusnames(cusnames);

//        BioEntity bioEntity = restTemplate.getForObject("http://localhost:8080/receive/" +sendEntity.getCusnames(), BioEntity.class);

        //Above was changed because I changed the application name
        BioEntity bioEntity = restTemplate.getForObject("http://BIO-SERVICE/receive/" +sendEntity.getCusnames(), BioEntity.class);



        vo.setSendEntity(sendEntity);
        vo.setBioEntity(bioEntity);
        return vo;
    }
}
