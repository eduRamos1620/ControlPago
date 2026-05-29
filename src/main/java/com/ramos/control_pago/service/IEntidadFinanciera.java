package com.ramos.control_pago.service;

import com.ramos.control_pago.dtos.EntidadFinancieraDTO;
import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.model.EntidadFinanciera;

import java.util.List;

public interface IEntidadFinanciera {

    List<EntidadFinancieraDTO> findByEntidadEstatusActivo();

    void save(EntidadFinancieraDTO entidadFinancieraDTO);
}
