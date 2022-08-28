package com.daveproject.External.Service;

import com.daveproject.External.Entity.SendEntity;
import com.daveproject.External.ValueObject.ResponseTemplateVO;

public interface SendService {
    SendEntity saveData(SendEntity sendEntity);

    SendEntity fetchCustomerByName(String cusnames);

    ResponseTemplateVO getDetailsWithCustomer(String cusnames);
}
