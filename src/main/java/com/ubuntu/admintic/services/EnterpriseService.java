package com.ubuntu.admintic.services;

import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository repository;

    public void crearYActualizarEmpresa(Enterprise enterprise){
        repository.save(enterprise);
    }
    //    public EnterpriseService(EnterpriseRepository repository){
//        this.repository=repository;
//    }
    public List<Enterprise> verEmpresa(){
        return this.repository.findAll();
    }

//    public Enterprise createEnterprise(Enterprise newEnterprise){
//        return this.repository.save(newEnterprise);
//    }
    public Enterprise verEmpresaPorId(Long id){
        return repository.findById(id).get();
    }
//    public Optional<Enterprise> findEnterprise(Long id) {
//        return this.repository.findById(id).;
//    }
    public void eliminarEmpresa(Long id){
        repository.deleteById(id);
    }
}
