package com.daveproject.inner.Service;

import com.daveproject.inner.Entity.BioEntity;

public interface BioService {


    BioEntity saveCustomer(BioEntity bioEntity);

    BioEntity fetchCustomerByName(String cusname);

    BioEntity fetchCustomerByAcc(String accno);

    BioEntity save(BioEntity bioEntity);

//    BioEntity fetchCustomerByAcc(String accno);
}
