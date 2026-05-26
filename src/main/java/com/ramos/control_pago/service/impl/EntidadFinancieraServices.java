package com.ramos.control_pago.service.impl;

import com.ramos.control_pago.dtos.EntidadFinancieraDTO;
import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.model.EntidadFinanciera;
import com.ramos.control_pago.repository.EntidadFinancieraRepository;
import com.ramos.control_pago.service.IEntidadFinanciera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadFinancieraServices implements IEntidadFinanciera {

    @Autowired
    private EntidadFinancieraRepository entidadRepository;

    @Override
    public List<EntidadFinancieraDTO> findByEntidadEstatusActivo() {
        List<EntidadFinancieraDTO> entidades = entidadRepository.findByEntidadEstatusActivo(EstatusEnum.ACTIVO).stream()
                .map(entidad -> EntidadFinancieraDTO.builder()
                        .nombre(entidad.getNombre())
                        .tipoEntidad(entidad.getTipoEntidad())
                        .build())
                .toList();
        return entidades;
    }
}
