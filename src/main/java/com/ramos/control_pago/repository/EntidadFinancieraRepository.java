package com.ramos.control_pago.repository;

import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.model.EntidadFinanciera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntidadFinancieraRepository extends JpaRepository<EntidadFinanciera,Long> {

    @Query("SELECT e FROM EntidadFinanciera e WHERE e.estatus = :estatus")
    List<EntidadFinanciera> findByEntidadEstatusActivo(@Param("estatus") EstatusEnum estatus);

}

