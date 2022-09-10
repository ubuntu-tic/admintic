package com.ubuntu.admintic.services;

import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    private EnterpriseRepository repository;
    public EnterpriseService(EnterpriseRepository repository){
        this.repository=repository;
    }
    public List<Enterprise> getEnterpriseList(){
        return this.repository.findAll();
    }

    public Enterprise createEnterprise(Enterprise newEnterprise){
        return this.repository.save(newEnterprise);
    }

    public Optional<Enterprise> findEnterprise(long id) {
        return this.repository.findById(id);
    }
}
