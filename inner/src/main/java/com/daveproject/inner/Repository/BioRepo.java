package com.daveproject.inner.Repository;

import com.daveproject.inner.Entity.BioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioRepo extends JpaRepository<BioEntity, Long> {

    public BioEntity findByCusname(String cusname);
    public BioEntity findByAccno(String accno);




}
