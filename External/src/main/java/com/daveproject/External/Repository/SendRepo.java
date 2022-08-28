package com.daveproject.External.Repository;

import com.daveproject.External.Entity.SendEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendRepo extends JpaRepository<SendEntity, Long> {

    SendEntity findByCusnames(String cusnames);



}
