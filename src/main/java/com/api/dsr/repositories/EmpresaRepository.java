package com.api.dsr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.dsr.models.EmpresaModel;

public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long>{

}
