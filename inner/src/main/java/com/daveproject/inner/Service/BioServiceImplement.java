package com.daveproject.inner.Service;


import com.daveproject.inner.Entity.BioEntity;
import com.daveproject.inner.Repository.BioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BioServiceImplement implements BioService{

    @Autowired
    private BioRepo bioRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public BioEntity saveCustomer(BioEntity bioEntity) {

        return bioRepo.save(bioEntity);






    }

    @Override
    public BioEntity fetchCustomerByName(String cusname) {
        return bioRepo.findByCusname(cusname);
    }

    @Override
    public BioEntity fetchCustomerByAcc(String accno) {
        return bioRepo.findByAccno(accno);
    }

    @Override
    public BioEntity save(BioEntity bioEntity) {
        return bioRepo.save(bioEntity);
    }

//    @Override
//    public BioEntity fetchCustomerByAcc(String accno) {
//        return bioRepo.findByAccno(accno);
//    }
}
